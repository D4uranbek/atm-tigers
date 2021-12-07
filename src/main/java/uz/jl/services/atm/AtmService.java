package uz.jl.services.atm;

import uz.jl.dao.atm.ATMDao;
import uz.jl.mapper.ATMMapper;
import uz.jl.models.atm.ATMEntity;
import uz.jl.services.BaseService;

import java.util.List;

/**
 * @author Elmurodov Javohir, Mon 10:46 AM. 12/6/2021
 */
public class AtmService extends BaseService<ATMEntity, ATMDao, ATMMapper> {

    public AtmService(ATMDao repository, ATMMapper mapper) {
        super(repository, mapper);
    }

    @Override
    protected void create(ATMEntity atmEntity) {

    }

    @Override
    protected void delete(ATMEntity atmEntity) {

    }

    @Override
    protected void delete(String id) {

    }

    @Override
    protected ATMEntity get(String id) {
        return null;
    }

    @Override
    protected List<ATMEntity> getAll() {
        return null;
    }

    @Override
    protected List<ATMEntity> getAll(int page, int limit) {
        return null;
    }

    @Override
    protected void update(String id, ATMEntity atmEntity) {

    }

}
