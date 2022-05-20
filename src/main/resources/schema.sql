create sequence Category_info_category_id_seq START WITH 1 INCREMENT BY 1;
create table Category_info (
      categoryId number(10,0) primary key,
      name varchar2(50) not null
);

create sequence Product_info_productId_seq START WITH 1 INCREMENT BY 1;
create table Product_info (
    productId number(10,2) primary key,
    productName varchar2(50) not null,
    brand varchar2(50),
    price double precision not null,
    imageUrl varbinary(max) not null,
    quantity varchar2(50) not null,
    categoryId number(10,0) not null,
    foreign key (category) references Category_info(categoryId)
);