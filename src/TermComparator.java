import java.util.Comparator;

public class TermComparator implements Comparator<Term> {
    @Override
    public int compare(Term t1, Term t2) {
        char var1 = t1.getVariable();
        char var2 = t2.getVariable();

        // Cas particulier : ' ' (indéfini) est toujours plus grand
        if (var1 == ' ' && var2 != ' ') return 1;
        if (var2 == ' ' && var1 != ' ') return -1;

        // Comparaison lexicographique des variables
        int varCompare = Character.compare(var1, var2);
        if (varCompare != 0) return varCompare;

        // Si variables identiques → comparer exposants (ordre décroissant)
        return Integer.compare(t2.getExponent(), t1.getExponent());
    }
}
