ALTER TABLE users
ALTER COLUMN role TYPE role_enum
USING role::role_enum;