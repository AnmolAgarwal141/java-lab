/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */
class newException extends Exception{
    String str = "An exception was encountered";
    @Override
    public String toString(){
        return str;
    }
}
class DefException {
    public static void main(String[] args){
        try{
            throw new newException();
        }catch(newException e){
            System.out.println(e);
        }
    }
}