package uz.jl.services;

/**
 * @author Elmurodov Javohir, Mon 10:52 AM. 12/6/2021
 */

import uz.jl.models.Auditable;

import java.util.List;

/**
 * @param <E> E -> Entity
 * @param <R> R -> Repository
 * @param <M> M -> Mapper
 */
public abstract class BaseService<E extends Auditable, R, M> {
    protected R repository;
    protected M mapper;

    public BaseService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    protected abstract void create(E e);

    protected abstract void delete(E e);

    protected abstract void delete(String id);

    protected abstract E get(String id);

    protected abstract List<E> getAll();

    protected abstract List<E> getAll(int page, int limit);

    protected abstract void update(String id, E e);


}
