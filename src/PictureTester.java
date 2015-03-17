

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture( "images/swan.jpg" );
    swan.edgeDetection( 10 );
    swan.explore();
  }

  public static void testKeepOnlyBlue()
  {

    Picture f14s = new Picture("images/two-F14D-in-flight.jpg");
    f14s.keepOnlyBlue();
    f14s.explore();

  }

  public static void testKeepOnlyRed()
  {

    Picture f14s = new Picture("images/two-F14D-in-flight.jpg");
    f14s.keepOnlyRed();
    f14s.explore();

  }

  public static void testKeepOnlyGreen()
  {

    Picture f14s = new Picture("images/two-F14D-in-flight.jpg");
    f14s.keepOnlyGreen();
    f14s.explore();

  }

  public static void testGrayscale()
  {

    Picture f14s = new Picture("images/two-F14D-in-flight.jpg");
    f14s.grayscale();
    f14s.explore();

  }

  public static void testMirrorVerticalRightToLeft()
  {

    Picture f14s = new Picture("images/two-F14D-in-flight.jpg");
    f14s.explore();
    f14s.mirrorVerticalRightToLeft();
    f14s.explore();

  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}