import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LLPolynomial implements Polynomial {

    private final List<Term> terms;

    public LLPolynomial() {
      this.terms = new ArrayList<>();
    }


    @Override
    public boolean addTerm(Term t) {
        if (t == null) return false;
        return terms.add(t);
    }

    @Override
    public boolean removeTerm(Term t) {
        return terms.remove(t);
    }

    @Override
    public int getTermCount() {
        return terms.size();
    }

    @Override
    public List<Character> getVariables() {
        Set<Character> uniqueVariables = new HashSet<>();
        for (Term t : terms) {
            uniqueVariables.add(t.getVariable());
        }
        return new ArrayList<>(uniqueVariables);
    }

    @Override
    public List<Integer> getExponents() {
        Set<Integer> uniqueExponents = new HashSet<>();
        for (Term t : terms) {
            uniqueExponents.add(t.getExponent());
        }
        return new ArrayList<>(uniqueExponents);
    }

    @Override
    public List<Term> getTerms(char variable, int exponent) {
        List<Term> filteredTerms = new ArrayList<>();
        for (Term t : terms) {
            if (t.getVariable() == variable && t.getExponent() == exponent) {
                filteredTerms.add(t);
            }
        }
        return filteredTerms;
    }

    @Override
    public List<Term> getAllTerms() {
        return new ArrayList<>(terms); 
    }
    @Override
    public String toString() {
      if (terms.isEmpty()) return "0";

      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < terms.size(); i++) {
          Term t = terms.get(i);
          String termStr = t.toString();

          if (i == 0) {
              sb.append(termStr);
          } else {
              if (t.getCoefficient() >= 0) {
                  sb.append("+").append(termStr);
              } else {
                  sb.append(termStr);
              }
          }
      }

      return sb.toString();
    }
    public void sort() {
      terms.sort(new TermComparator());
    }
}
