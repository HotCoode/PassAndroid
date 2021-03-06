package org.ligi.passandroid.injections;

import java.util.ArrayList;
import java.util.List;
import org.ligi.passandroid.model.Pass;
import org.ligi.passandroid.model.PassStore;

public class FixedPassListPassStore implements PassStore {

    private final List<Pass> passes;
    private Pass actPass;

    public FixedPassListPassStore(List<Pass> passes) {
        this.passes = passes;
    }

    @Override
    public void preCachePassesList() {
        // no effect in this impl
    }

    @Override
    public void deleteCacheForId(String id) {
        // no effect in this impl
    }

    @Override
    public void deleteCache() {
        // no effect in this impl
    }

    @Override
    public void deleteCache(String id) {
        // no effect in this impl
    }

    @Override
    public void refreshPassesList() {
        // no effect in this impl
    }

    @Override
    public int passCount() {
        return passes.size();
    }

    @Override
    public boolean isEmpty() {
        return passCount() == 0;
    }

    @Override
    public Pass getPassbookAt(int pos) {
        return passes.get(pos);
    }

    @Override
    public Pass getPassbookForId(String id) {
        for (Pass pass : passes) {
            if (pass.getId().equals(id)) {
                return pass;
            }
        }
        return null;
    }

    @Override
    public void sort(SortOrder order) {
    }

    @Override
    public List<CountedType> getCountedTypes() {
        return new ArrayList<>();
    }

    @Override
    public Pass getCurrentPass() {
        return actPass;
    }

    @Override
    public void setCurrentPass(Pass pass) {
        actPass = pass;
    }

    @Override
    public boolean deletePassWithId(String id) {
        return false;
    }

    @Override
    public String getPathForID(String id) {
        return null;
    }
}
