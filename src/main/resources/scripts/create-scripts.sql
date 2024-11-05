create schema kys;
CREATE TABLE kys.kullanici (
                               id int8 NOT NULL,
                               kullanici_adi int8 NOT NULL,
                               ad varchar NOT NULL,
                               soyad varchar NULL,
                               uuid uuid NOT NULL,
                               kayit_zamani timestamp(6) NOT NULL DEFAULT now(),
                               kaydeden_fk_kullanici_id int8 NULL,
                               CONSTRAINT kullanici_adi_unq UNIQUE (kullanici_adi),
                               CONSTRAINT kullanici_pkey PRIMARY KEY (id)
);

-- Column comments

COMMENT ON COLUMN kys.kullanici.id IS 'KULLANICI_SEQ sekansından sıradaki sayıyı almaktadır';
COMMENT ON COLUMN kys.kullanici.ad IS 'Kullanıcıya ait ad bilgisidir';
COMMENT ON COLUMN kys.kullanici.kayit_zamani IS 'İlgili kaydın zaman bilgisidir';
COMMENT ON COLUMN kys.kullanici.kullanici_adi IS 'Kullanıcıya ait Kullanıcı adı bilgisidir. Bu alan; TC Kimlik Numarası, kurum kodu ya da sanal üretilecek tekil değerdir';
COMMENT ON COLUMN kys.kullanici.soyad IS 'Kullanıcıya ait soyad bilgisidir';
COMMENT ON COLUMN kys.kullanici.uuid IS 'Kullanıcıya ait oluşturulan UUID değeridir';

-------------------------------------------------------------------------------------------------------------------

CREATE TABLE kys.kullanici_iletisim (
                                        id int4 NOT NULL, -- KULLANICI_ILETISIM_SEQ sekansından sıradaki sayıyı almaktadır
                                        fk_kullanici_id int8 NOT NULL, -- Kullanıcının ID bilgisidir. Değerini KULLANICI Tablosundan alır.
                                        cep_telefonu int8 NOT NULL, -- Kullanıcının cep telefonu bilgisidir.
                                        aktif bool NOT NULL, -- Kullanıcı rol bilgisinin aktiflik durumunu ifade eder
                                        kayit_zamani timestamp(6) NOT NULL DEFAULT now(), -- İlgili kaydın zaman bilgisidir
                                        kaydeden_fk_kullanici_id int8 NOT NULL, -- İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır
                                        CONSTRAINT kullanici_iletisim_pkey PRIMARY KEY (id)
);

-- Column comments

COMMENT ON COLUMN kys.kullanici_iletisim.id IS 'KULLANICI_ILETISIM_SEQ sekansından sıradaki sayıyı almaktadır';
COMMENT ON COLUMN kys.kullanici_iletisim.fk_kullanici_id IS 'Kullanıcının ID bilgisidir. Değerini KULLANICI Tablosundan alır.';
COMMENT ON COLUMN kys.kullanici_iletisim.cep_telefonu IS 'Kullanıcının cep telefonu bilgisidir.';
COMMENT ON COLUMN kys.kullanici_iletisim.aktif IS 'Kullanıcı rol bilgisinin aktiflik durumunu ifade eder';
COMMENT ON COLUMN kys.kullanici_iletisim.kayit_zamani IS 'İlgili kaydın zaman bilgisidir';
COMMENT ON COLUMN kys.kullanici_iletisim.kaydeden_fk_kullanici_id IS 'İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır';
-------------------------------------------------------------------------------------------------------------------


CREATE TABLE kys.kullanici_parola (
                                      id int4 NOT NULL, -- KULLANICI_PAROLA_SEQ sekansından sıradaki sayıyı almaktadır
                                      fk_kullanici_rol_id int8 NOT NULL, -- Kullanıcının ROL ID bilgisidir. Değerini KULLANICI_ROL Tablosundan alır
                                      parola varchar NOT NULL, -- Giriş yapan kullanıcının parola değerinin SHA3 olarak tutulduğu alandır
                                      aktif bool NOT NULL, -- Kullanıcının parolasının aktiflik bilgisini ifade eder
                                      kayit_zamani timestamp(6) NOT NULL DEFAULT now(), -- İlgili kaydın zaman bilgisidir
                                      kaydeden_fk_kullanici_rol_id int8 NOT NULL, -- İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır
                                      CONSTRAINT kullanici_parola_pkey PRIMARY KEY (id)
);

-- Column comments

COMMENT ON COLUMN kys.kullanici_parola.id IS 'KULLANICI_PAROLA_SEQ sekansından sıradaki sayıyı almaktadır';
COMMENT ON COLUMN kys.kullanici_parola.aktif IS 'Kullanıcının parolasının aktiflik bilgisini ifade eder';
COMMENT ON COLUMN kys.kullanici_parola.fk_kullanici_rol_id IS 'Kullanıcının ROL ID bilgisidir. Değerini KULLANICI_ROL Tablosundan alır';
COMMENT ON COLUMN kys.kullanici_parola.kaydeden_fk_kullanici_rol_id IS 'İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır';
COMMENT ON COLUMN kys.kullanici_parola.kayit_zamani IS 'İlgili kaydın zaman bilgisidir';
COMMENT ON COLUMN kys.kullanici_parola.parola IS 'Giriş yapan kullanıcının parola değerinin SHA3 olarak tutulduğu alandır';

-------------------------------------------------------------------------------------------------------------------

CREATE TABLE kys.kullanici_rol (
                                   id int8 NOT NULL, -- KULLANICI_ROL_SEQ sekansından sıradaki sayıyı almaktadır
                                   fk_kullanici_id int8 NOT NULL, -- Değerini KULLANICI Tablosundan alır
                                   l_rol int4 NOT NULL, -- Kullanıcıya ait rol bilgisidir. Kullanıcının sitemdeki görevini ifade eder (hekim, vatandaş, yetkili, sistem yöneticisi vb)
                                   aktif bool NOT NULL DEFAULT true, -- Kullanıcı rol bilgisinin aktiflik durumunu ifade eder
                                   kayit_zamani timestamp(6) NOT NULL DEFAULT now(), -- İlgili kaydın zaman bilgisidir
                                   kaydeden_fk_kullanici_rol_id int8 NOT NULL, -- İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır
                                   CONSTRAINT kullanici_rol_pkey PRIMARY KEY (id)
);
CREATE UNIQUE INDEX kullanici_rol_fk_kullanici_id_idx ON kys.kullanici_rol USING btree (fk_kullanici_id, l_rol);

-- Column comments

COMMENT ON COLUMN kys.kullanici_rol.id IS 'KULLANICI_ROL_SEQ sekansından sıradaki sayıyı almaktadır';
COMMENT ON COLUMN kys.kullanici_rol.aktif IS 'Kullanıcı rol bilgisinin aktiflik durumunu ifade eder';
COMMENT ON COLUMN kys.kullanici_rol.fk_kullanici_id IS 'Değerini KULLANICI Tablosundan alır';
COMMENT ON COLUMN kys.kullanici_rol.kaydeden_fk_kullanici_rol_id IS 'İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır';
COMMENT ON COLUMN kys.kullanici_rol.kayit_zamani IS 'İlgili kaydın zaman bilgisidir';
COMMENT ON COLUMN kys.kullanici_rol.l_rol IS 'Kullanıcıya ait rol bilgisidir. Kullanıcının sitemdeki görevini ifade eder (hekim, vatandaş, yetkili, sistem yöneticisi vb)';


-------------------------------------------------------------------------------------------------------------------
CREATE TABLE kys.kullanici_yetki (
                                     id int4 NOT NULL , -- UHDS_KULLANICI_YETKI_SEQ sekansından sıradaki sayıyı almaktadır
                                     fk_kullanici_id int8 NOT NULL, -- Kullanıcının ID bilgisidir. Değerini UHDS_KULLANICI Tablosundan alır
                                     fk_yetki_id int4 NOT NULL, -- Giriş yapan kullanıcının yetki bilgisidir. Değerini YETKI Tablosundan alır
                                     aktif bool NOT NULL, -- Kullanıcının yetkisinin aktiflik bilgisini ifade eder
                                     kayit_zamani timestamp(6) NOT NULL DEFAULT now(), -- İlgili kaydın zaman bilgisidir
                                     kaydeden_fk_kullanici_rol_id int8 NOT NULL, -- İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır
                                     CONSTRAINT kullanici_yetki_pkey PRIMARY KEY (id)
);

-- Column comments

COMMENT ON COLUMN kys.kullanici_yetki.id IS 'UHDS_KULLANICI_YETKI_SEQ sekansından sıradaki sayıyı almaktadır';
COMMENT ON COLUMN kys.kullanici_yetki.aktif IS 'Kullanıcının yetkisinin aktiflik bilgisini ifade eder';
COMMENT ON COLUMN kys.kullanici_yetki.fk_kullanici_id IS 'Kullanıcının ID bilgisidir. Değerini UHDS_KULLANICI Tablosundan alır';
COMMENT ON COLUMN kys.kullanici_yetki.fk_yetki_id IS 'Giriş yapan kullanıcının yetki bilgisidir. Değerini YETKI Tablosundan alır';
COMMENT ON COLUMN kys.kullanici_yetki.kaydeden_fk_kullanici_rol_id IS 'İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır';
COMMENT ON COLUMN kys.kullanici_yetki.kayit_zamani IS 'İlgili kaydın zaman bilgisidir';

-------------------------------------------------------------------------------------------------------------------

CREATE TABLE kys.rol_yetki (
                               id int4 NOT NULL , -- UHDS_KULLANICI_YETKI_SEQ sekansından sıradaki sayıyı almaktadır
                               l_rol int4 NOT NULL, -- Yetkiye ait rol bilgisidir. Değerini LOOKUP Tablosundan alır (hekim, vatandaş, yetkili, sistem yöneticisi vb).
                               fk_yetki_id int4 NOT NULL, -- Giriş yapan kullanıcının yetki bilgisidir. Değerini YETKI Tablosundan alır
                               aktif bool NOT NULL, -- Rol-yetki eşleşmesinin aktiflik bilgisini ifade eder
                               kayit_zamani timestamp(6) NOT NULL DEFAULT now(), -- İlgili kaydın zaman bilgisidir
                               kaydeden_fk_kullanici_rol_id int8 NOT NULL, -- İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır
                               CONSTRAINT rol_yetki_pkey PRIMARY KEY (id)
);

-- Column comments

COMMENT ON COLUMN kys.rol_yetki.id IS 'UHDS_KULLANICI_YETKI_SEQ sekansından sıradaki sayıyı almaktadır';
COMMENT ON COLUMN kys.rol_yetki.aktif IS 'Rol-yetki eşleşmesinin aktiflik bilgisini ifade eder';
COMMENT ON COLUMN kys.rol_yetki.fk_yetki_id IS 'Giriş yapan kullanıcının yetki bilgisidir. Değerini YETKI Tablosundan alır';
COMMENT ON COLUMN kys.rol_yetki.kaydeden_fk_kullanici_rol_id IS 'İlgili işlemi yapan kullanıcıya ait ID bilgisidir. Değerinin KULLANICI_ROL Tablosundan alır';
COMMENT ON COLUMN kys.rol_yetki.kayit_zamani IS 'İlgili kaydın zaman bilgisidir';
COMMENT ON COLUMN kys.rol_yetki.l_rol IS 'Yetkiye ait rol bilgisidir. Değerini LOOKUP Tablosundan alır (hekim, vatandaş, yetkili, sistem yöneticisi vb).';


-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------
CREATE TABLE kys.yetki (
                           id int4 NOT NULL , -- YETKI_SEQ sekansından sıradaki sayıyı almaktadır
                           yetki_adi varchar NOT NULL, -- Tanımlanan yetkinin ad bilgisidir
                           aciklama varchar NOT NULL, -- Tanımlanan yetkinin içerik bilgisidir.
                           aktif bool NOT NULL, -- Tanımlanan kullanıcının aktiflik bilgisidir
                           kayit_zamani timestamp(6) NOT NULL DEFAULT now(), -- İlgili kaydın kayıt zamanıdır.
                           kaydeden_fk_kullanici_rol_id int4 NOT NULL, -- İlgili kaydı yapan kullanıcı rol bilgisidir.
                           CONSTRAINT yetki_pkey PRIMARY KEY (id)
);

-- Column comments

COMMENT ON COLUMN kys.yetki.id IS 'YETKI_SEQ sekansından sıradaki sayıyı almaktadır';
COMMENT ON COLUMN kys.yetki.aciklama IS 'Tanımlanan yetkinin içerik bilgisidir.';
COMMENT ON COLUMN kys.yetki.aktif IS 'Tanımlanan kullanıcının aktiflik bilgisidir';
COMMENT ON COLUMN kys.yetki.kaydeden_fk_kullanici_rol_id IS 'İlgili kaydı yapan kullanıcı rol bilgisidir.';
COMMENT ON COLUMN kys.yetki.kayit_zamani IS 'İlgili kaydın kayıt zamanıdır.';
COMMENT ON COLUMN kys.yetki.yetki_adi IS 'Tanımlanan yetkinin ad bilgisidir';

-------------------------------------------------------
create schema genel;
CREATE TABLE genel.mesaj (
                             id BIGSERIAL PRIMARY KEY,
                             l_http_status INTEGER,
                             adi VARCHAR(150),
                             kodu VARCHAR(50),
                             mesaj VARCHAR(1000),
                             l_seviye_tipi INTEGER,
                             aktif BOOLEAN,
                             kayit_zamani TIMESTAMP,
                             kaydeden_fk_kullanici_rol_id BIGINT
);

CREATE TABLE genel.parametre (
                                 id SERIAL PRIMARY KEY,
                                 l_veri_tipi INTEGER,
                                 adi VARCHAR(255),
                                 deger VARCHAR(255),
                                 aciklama VARCHAR(500),
                                 aktif BOOLEAN,
                                 kayit_zamani TIMESTAMP,
                                 kaydeden_fk_kullanici_rol_id BIGINT
);

