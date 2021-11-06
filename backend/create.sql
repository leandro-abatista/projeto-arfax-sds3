
    create table tb_vendas (
       id  bigserial not null,
        clientes_visitados int4,
        data_venda date,
        negocios_fechados int4,
        quantia_vendida float8,
        vendedor_id int8,
        primary key (id)
    );

    create table tb_vendedores (
       id  bigserial not null,
        nome varchar(255),
        primary key (id)
    );

    alter table tb_vendas 
       add constraint FK9u55k6le8afh4a3haulsu4cc6 
       foreign key (vendedor_id) 
       references tb_vendedores;
