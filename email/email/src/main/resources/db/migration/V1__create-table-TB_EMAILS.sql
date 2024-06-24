CREATE TABLE TB_EMAILS (
     emailId SERIAL PRIMARY KEY,
     userId SERIAL,
     emailFrom VARCHAR(60),
     emailTo VARCHAR(60),
     subject TEXT,
     text TEXT,
     sendDateEmail DATE,
     statusEmail VARCHAR(10)
);