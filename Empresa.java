/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
public class Empresa {
    private String nome;
    private String endereço;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    
    public Empresa(){
        this("", "", "", "", "", "");
    }

    public Empresa(String nome, String endereço, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void leitura(){
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        setEndereço(JOptionPane.showInputDialog("Digite o endereço: "));
        setCidade(JOptionPane.showInputDialog("Digite a cidade: "));
        setEstado(JOptionPane.showInputDialog("Digite o estado: "));
        setCep(JOptionPane.showInputDialog("Digite o Cep: "));
        setTelefone(JOptionPane.showInputDialog("Digite o telefone: "));
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, toString());
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", endereço=" + endereço + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", telefone=" + telefone + '}';
    }
    
}
