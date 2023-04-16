/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea4endes23;


public class CCuenta {

    /**
     * @author Edgar
     * 
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**
     * Este es el contructor de las cuentas
     * @param nom Recibe el nombre del propietario/a de la cuenta
     * @param cue recibe el numero de la cuenta
     * @param sal recibe el saldo de la cuenta
     * @param tipo recibe el tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Este método permite ver el saldo de la cuenta
     * @return el saldo de la cuenta
     */
    public double estado(){
        return this.saldo;
    }
    /**
     * Este método permite ingresar dinero en una cuenta de banco
     * @throws Exception Lanza una excepción si se introducen cantidades negativas
     * @param cantidad recibe la cantidad a ingresar
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Este método permite retirar dinero en una cuenta de banco
     * @throws Exception Lanza una excepción si se introducen cantidades negativas y lanza una excepción si no hay suficiente saldo en la cuenta.
     * @param cantidad recibe la cantidad a retirar
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
