package uz.jl.services;

/**
 * @author Elmurodov Javohir, Mon 10:52 AM. 12/6/2021
 */

import uz.jl.models.BaseEntity;

/**
 * @param <E> E -> Entity
 * @param <R> R -> Repository
 * @param <M> M -> Mapper
 */
public abstract class BaseAbstractService<E extends BaseEntity, R, M> implements IBaseCrudService<E> {
    protected R repository;
    protected M mapper;

    public BaseAbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

}
