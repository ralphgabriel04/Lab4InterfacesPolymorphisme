import java.util.*;

public class VectorPolynomial implements Polynomial {

    private final Vector<Term> terms;

    // Constructeur sans paramètre
    public VectorPolynomial() {
        this.terms = new Vector<>();
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
        Set<Character> variables = new HashSet<>();
        for (Term t : terms) {
            variables.add(t.getVariable());
        }
        return new ArrayList<>(variables);
    }

    @Override
    public List<Integer> getExponents() {
        Set<Integer> exponents = new HashSet<>();
        for (Term t : terms) {
            exponents.add(t.getExponent());
        }
        return new ArrayList<>(exponents);
    }

    @Override
    public List<Term> getTerms(char variable, int exponent) {
        List<Term> matchingTerms = new ArrayList<>();
        for (Term t : terms) {
            if (t.getVariable() == variable && t.getExponent() == exponent) {
                matchingTerms.add(t);
            }
        }
        return matchingTerms;
    }

    @Override
    public List<Term> getAllTerms() {
        return new ArrayList<>(terms); // copie défensive
    }

    // Redéfinition de toString avec même logique que LLPolynomial
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
                    sb.append(termStr); // déjà avec le signe -
                }
            }
        }

        return sb.toString();
    }
}
