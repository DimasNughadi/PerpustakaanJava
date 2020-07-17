package perpustakaanpcr;

import View.FrmUtama;
import Control.UtamaControl;

public class PerpustakaanPCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            FrmUtama frm = new FrmUtama();
            UtamaControl ctrl = new UtamaControl(frm);
            frm.setVisible(true);

    }
    
}
