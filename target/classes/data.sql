CREATE SEQUENCE IF NOT EXISTS SQ_ARIS;

CREATE TABLE IF NOT EXISTS ARIS (
                       id number(10,0) not null,
                       macro_proceso varchar(50),
                       sub_proceso varchar(50),
                       proceso varchar(50),
                       id_proc varchar(4),
                       primary key (id)
) ;;

INSERT INTO ARIS VALUES(1, 'ODT', 'MTI','010', '001');
INSERT INTO ARIS VALUES(2, 'ODT', 'MTI','010', '002');
INSERT INTO ARIS VALUES(3, 'ODT', 'MTI','010', '003');