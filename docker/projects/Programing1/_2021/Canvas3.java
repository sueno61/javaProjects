public class Canvas3 {
    public static void main(String[] args) {
      String[] img = {"imgs/quilt/quiltB.png", "imgs/quilt/quiltA.png"};
      for (int r = 0; r < 4; r = r +1) {
        double rt = Math.PI*(r*90)/180;
  
        for (int l = 1; l <= 3; l = l + 1) {
          for (int c = 1; c <=3; c = c + 1) {
            // Plate.Canvas.drawImage(c*200-100, l*200-100, rt, 0.5, img[(l*c)%2]);
            System.out.println(img);
            System.out.println(rt);
          }
        }
  
      }          
  
    }
  }