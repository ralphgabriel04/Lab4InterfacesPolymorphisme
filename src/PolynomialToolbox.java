import java.util.*;

public class PolynomialToolbox {

    public static Polynomial simplify(Polynomial poly) {
        Map<String, Double> map = new HashMap<>();

        for (Term t : poly.getAllTerms()) {
            String key = t.getVariable() + "_" + t.getExponent();
            map.put(key, map.getOrDefault(key, 0.0) + t.getCoefficient());
        }

        Polynomial simplified = new LLPolynomial();

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            double coef = entry.getValue();
            if (coef == 0.0) continue; // Élimine les termes nuls

            String[] parts = entry.getKey().split("_");
            char variable = parts[0].charAt(0);
            int exponent = Integer.parseInt(parts[1]);

            simplified.addTerm(new Term(coef, variable, exponent));
        }

        return simplified;
    }

    public static Polynomial sum(Polynomial poly1, Polynomial poly2) {
      Polynomial result = new LLPolynomial();

      // Ajouter tous les termes du premier polynôme
      for (Term t : poly1.getAllTerms()) {
          result.addTerm(t);
      }

      // Ajouter tous les termes du deuxième polynôme
      for (Term t : poly2.getAllTerms()) {
          result.addTerm(t);
      }

      // Simplifier la somme
      return simplify(result);
    }

}
