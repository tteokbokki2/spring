
-- FileTest> script.sql

-- 장소 등록
create table tblPlace (
    seq number primary key,
    subject varchar2(500) not null,
    content varchar2(1000) not null,
    regdate date default sysdate not null
);

create table tblPic (
    seq number primary key,
    filename varchar2(300) not null,
    pseq number references tblPlace(seq) not null
);

create sequence seqPlace;
create sequence seqPic;

select * from tblPlace;
select * from tblPic;

commit;

select a.*, (select count(*) from tblPic where pseq = a.seq) as picCount from tblPlace a order by seq desc;