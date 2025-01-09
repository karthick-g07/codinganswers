/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;
import java.lang.*;
import java.util.*;

/**
 *
 * @author thetr
 */
public class swappingzerotoend {
 
    public static void main(String args[]){
    int a[]={1,2,2,0,5,0,8,9};
    
     int l=0;
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]!=0)
            {
                if(i!=l)
                {
                    a[l]=a[i];
                    a[i]=0;
                }
                l++;
            }
                
        }
        for(int x:a)
        {
            System.out.print(x);
        }
    }
   
    
}
