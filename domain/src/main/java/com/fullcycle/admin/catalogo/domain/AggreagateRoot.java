package com.fullcycle.admin.catalogo.domain;

public class AggreagateRoot<ID extends Identifier>  extends Entity<ID> {

    protected AggreagateRoot(ID id){
        super(id);
    }
}
