CREATE TABLE stock(
	id SERIAL PRIMARY KEY,
	ticker VARCHAR(10) NOT NULL UNIQUE,
	name VARCHAR(100) NOT NULL,
	exchange_market VARCHAR(10) NOT NULL,
	sector VARCHAR(20) NOT NULL,
	shares_issued BIGINT NOT NULL,
	create_datetime TIMESTAMP NOT NULL DEFAULT NOW()
);

INSERT INTO stock(ticker, name, exchange_market, sector, shares_issued) VALUES ('4373', 'シンプレクス・ホールディングス','PRIME','情報・通信業','57965350');
INSERT INTO stock(ticker, name, exchange_market, sector, shares_issued) VALUES ('8473', 'SBIホールディングス','PRIME','証券、商品先物取引業','275700090');
INSERT INTO stock(ticker, name, exchange_market, sector, shares_issued) VALUES ('7163', '住信SBIネット銀行','STANDARD','銀行業','150793800');