SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS reply;
DROP TABLE IF EXISTS Board;
DROP TABLE IF EXISTS Users;




/* Create Tables */

CREATE TABLE Board
(
	bid int NOT NULL,
	btitle varchar(100) NOT NULL,
	bcontent varchar(4096) NOT NULL,
	uid varchar(12) NOT NULL,
	modTime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	viewCount int DEFAULT 0 NOT NULL,
	replyCount int DEFAULT 0 NOT NULL,
	PRIMARY KEY (bid)
);


CREATE TABLE reply
(
	rid int NOT NULL,
	rcontent varchar(256) NOT NULL,
	regTime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	isMine int NOT NULL,
	uid varchar(12) NOT NULL,
	bid int NOT NULL,
	PRIMARY KEY (rid)
);


CREATE TABLE Users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(10) NOT NULL,
	email varchar(20),
	regDate date DEFAULT (CURRENT_TIMESTAMP) NOT NULL,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (bid)
	REFERENCES Board (bid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Board
	ADD FOREIGN KEY (uid)
	REFERENCES Users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reply
	ADD FOREIGN KEY (uid)
	REFERENCES Users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



