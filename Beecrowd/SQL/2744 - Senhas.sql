SELECT id, password, MD5(password) AS encrypted_password
FROM account;