package co.igb.ejb;

import javax.ejb.Stateless;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author dvelasquez
 */
@Stateless
public class PasswordRecoveryEJB {
    private static final long EXPIRATION_TIME = 4 * 60 * 1000L;
    private final Map<String, RecoveryData> recoveryCodes = new ConcurrentHashMap<>();
    private final SecureRandom secureRandom = new SecureRandom();

    public String createCode(String username, String email) {
        String code = String.valueOf(secureRandom.nextInt(900000) + 100000);

        long expiration = System.currentTimeMillis() + EXPIRATION_TIME;
        RecoveryData data = new RecoveryData(code, expiration, false);
        recoveryCodes.put(generateKey(username, email), data);

        return code;
    }

    public boolean verifyCode(String username, String email, String code) {
        String key = generateKey(username, email);
        RecoveryData data = recoveryCodes.get(key);

        if (data == null) {
            return false;
        }
        if (System.currentTimeMillis() > data.getExpirationTime()) {
            recoveryCodes.remove(key);
            return false;
        }
        if (!data.getCode().equals(code)) {
            return false;
        }
        data.setVerified(true);

        return true;
    }

    public boolean isVerified(String username, String email, String code) {
        String key = generateKey(username, email);
        RecoveryData data = recoveryCodes.get(key);

        if (data == null) {
            return false;
        }
        if (System.currentTimeMillis() > data.getExpirationTime()) {
            recoveryCodes.remove(key);
            return false;
        }

        return data.isVerified() && data.getCode().equals(code);
    }

    public void remove(String username, String email) {
        recoveryCodes.remove(generateKey(username, email));
    }

    private String generateKey(String username, String email) {
        return username.trim().toLowerCase() + "|" + email.trim().toLowerCase();
    }

    private static class RecoveryData {
        private String code;
        private long expirationTime;
        private boolean verified;

        public RecoveryData(String code, long expirationTime, boolean verified) {
            this.code = code;
            this.expirationTime = expirationTime;
            this.verified = verified;
        }

        public String getCode() {
            return code;
        }

        public long getExpirationTime() {
            return expirationTime;
        }

        public boolean isVerified() {
            return verified;
        }

        public void setVerified(boolean verified) {
            this.verified = verified;
        }
    }
}