package Family;

import android.view.ViewDebug;

import javax.inject.Inject;

/**
 * Created by tchl on 2016-05-04.
 */
public class USAFamily {
    private String familyname;
    private void setFamilyName(String name){
        System.out.println(" [_]P tchl USAFamily  setFamilyName [_]P "+name);
        familyname = name;
    }

    public void USAFamily(){;}
    void USAFamily (String str){
          System.out.println(" [_]P tchl USAFamily contructor: param=string [_]P "+str);
      }
    public void USAFamily(int k){
        System.out.println(" [_]P tchl USAFamily contructor: param=int ! [_]P "+ Integer.toString(k));
    }
    public  void getFamilyName(){
        System.out.println(" [_]P tchl USAFamily getFamilyName ! [_]P "+familyname);
    }
}
