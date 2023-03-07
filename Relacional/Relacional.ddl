-- Gerado por Oracle SQL Developer Data Modeler 21.4.2.059.0838
--   em:        2023-03-06 13:11:51 BRT
--   site:      Oracle Database 21c
--   tipo:      Oracle Database 21c



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE t_psc_cliente (
    id_cliente                               NUMBER NOT NULL,
    nm_cliente                               VARCHAR2(50) NOT NULL,
    dh_criacao                               DATE NOT NULL,
    st_cliente                               VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
    ,
    t_psc_estabelecimento_id_estabelecimento NUMBER NOT NULL
)
LOGGING;

ALTER TABLE t_psc_cliente ADD CONSTRAINT t_psc_cliente_pk PRIMARY KEY ( id_cliente );

CREATE TABLE t_psc_estabelecimento (
    id_estabelecimento NUMBER NOT NULL,
    nm_estabelecimento VARCHAR2(50) NOT NULL,
    dh_criacao         DATE NOT NULL
)
LOGGING;

ALTER TABLE t_psc_estabelecimento ADD CONSTRAINT t_psc_estabelecimento_pk PRIMARY KEY ( id_estabelecimento );

CREATE TABLE t_psc_fornecedor (
    id_fornecedor                            NUMBER NOT NULL,
    nm_fornecedor                            VARCHAR2(50) NOT NULL,
    dh_criacao                               DATE NOT NULL,
    st_fornecedor                            VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
    ,
    t_psc_estabelecimento_id_estabelecimento NUMBER NOT NULL
)
LOGGING;

ALTER TABLE t_psc_fornecedor ADD CONSTRAINT t_psc_fornecedor_pk PRIMARY KEY ( id_fornecedor );

ALTER TABLE t_psc_cliente
    ADD CONSTRAINT t_psc_cliente_t_psc_estabelecimento_fk FOREIGN KEY ( t_psc_estabelecimento_id_estabelecimento )
        REFERENCES t_psc_estabelecimento ( id_estabelecimento )
    NOT DEFERRABLE;

ALTER TABLE t_psc_fornecedor
    ADD CONSTRAINT t_psc_fornecedor_t_psc_estabelecimento_fk FOREIGN KEY ( t_psc_estabelecimento_id_estabelecimento )
        REFERENCES t_psc_estabelecimento ( id_estabelecimento )
    NOT DEFERRABLE;



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             3
-- CREATE INDEX                             0
-- ALTER TABLE                              5
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   2
-- WARNINGS                                 0
