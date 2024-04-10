/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
public class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedio;
    
    public Restaurante(){
        this("", "", "", "", "", "", "", 0);
    }

    public Restaurante(String tipoComida, double precoMedio) {
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    public Restaurante(String tipoComida, double precoMedio, String nome, String endereço, String cidade, String estado, String cep, String telefone) {
        super(nome, endereço, cidade, estado, cep, telefone);
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }
    
    @Override
    public void leitura(){
         super.leitura();
         setTipoComida(JOptionPane.showInputDialog("Digite o tipo de comida: "));
         setPrecoMedio(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da comida: ")));
    }
    
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null,toString());
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "/n tipoComida=" + tipoComida + "/n precoMedio=" + precoMedio + '}';
    }
    
    
    
}
