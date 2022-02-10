package com.dio.base;

import java.math.BigDecimal;

//import java.math.BigDecimal;


/**
 * @author Thales Galvão
 * @version 0.1.0
 * @see BigDecimal
 * @since 0.1.0
 */
public class Order {
    
    // representa o código do pedido
    private final String code;
    private final BigDecimal totalvalue;

    /**
     * Construtor da classe
     * 
     * @param code              Codigo do pedido
     * @param totalvalue        Valor total do pedido
     */
    public Order(String code, BigDecimal totalvalue){
        this.code = code;
        this.totalvalue = totalvalue;
    }

    public String getCode() {
        return code;
    }


    /**
     * Calcula o valor total de acordo com o valor do pedido. Se o valor for maior que R$100,00 uma taxa sera cobrada.
     * 
     * @return Valor total do pedido com as taxas
     * @throws RuntimeException Se o valor pedido for negativo
     */
    public BigDecimal calculateFee() throws RuntimeException{
        if(this.totalvalue.signum() < 0){
            throw new RuntimeException("O pedido não pode ter valor negativo");
        }
        if(this.totalvalue.compareTo(new BigDecimal("100.00")) > 100){
            return this.totalvalue.multiply(new BigDecimal("0.99"));
        }
        return this.totalvalue;
    }

/*
    public int calculateFee(){
        if (totalvalue > 100){
            return totalvalue * 0.99;
        } else{
            return totalvalue;
        }
    }
*/
/*
    public double calculateFee(){
        switch(totalvalue){
            case 100:
                return totalvalue * 0.99;
            case 200:
                return totalvalue * 1.99;
            default:
                return totalvalue;
        }

    }
*/
/*
    @Override
    public String toString(){
        return "Order ={" +
                "code='" + code + "'" +
                "}";
    }
*/

/*
    public void printItems(){
        
        do {

        }while()
        
        while(){

        }
        
        for(){

        }
        
        for(String i : items){

        }
    }
*/
}
