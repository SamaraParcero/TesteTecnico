package com.distribuidoraPercentual.exameTecnico;

import java.util.HashMap;
import java.util.Map;

public class DistribuidoraPercentual {

	public static void main(String[] args) {
		double soma = 0;
		double percentual = 0;
		
		Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);
        
        for ( double valor : faturamento.values()) {
        	soma = soma + valor;
        }
        
        
        
        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            percentual = (valor * 100) / soma;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
        
	}

}
