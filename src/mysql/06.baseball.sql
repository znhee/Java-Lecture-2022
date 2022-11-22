# baseball table 생성

CREATE TABLE IF NOT EXISTS baseballplayer (
	backNum INT PRIMARY KEY,				
	`name` VARCHAR(8) NOT NULL,
	`position` VARCHAR(4) NOT NULL,
	birthday DATE,
	height INT,
    isDeleted INT DEFAULT 0
);

# baseball table 선수 등록
INSERT INTO baseballplayer (backNum, `name`, `position`, birthday, height)
	VALUES (51, '이정후', '외야수', '1998-08-20', 185);