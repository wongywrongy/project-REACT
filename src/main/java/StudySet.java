import java.util.*;

class StudySet{

    private ArrayList<Term> sett = new ArrayList<Term>();

    public StudySet(ArrayList<Term> userSet) {
        sett = userSet;
    }

    public ArrayList<Term> getSet() {
        return sett;
    }

    public void addTerm(Term userTerm) {
        sett.add(userTerm);
    }

    public void addTerm(Term userTerm, int index) {
        sett.add(index, userTerm);
    }

    public void removeTerm(int index) {
        sett.remove(index);
    }

    public void modifyTerm(Term userTerm, int index) {
        sett.set(index, userTerm);
    }
}