package SemiColon;

import java.util.ArrayList;
import java.util.List;

public class Semi_Colon {
    private List<Cohort> cohortsList;

    public List<Cohort> getCohorts() {
        return cohortsList;
    }

    public Semi_Colon(Cohort cohorts) {
        this.cohortsList = new ArrayList<>();
        this.cohortsList.add(cohorts);
    }

    public void setCohortsList(Cohort cohortsList) {
        this.cohortsList.add(cohortsList);
    }



}
