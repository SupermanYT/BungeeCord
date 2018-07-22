package net.md_5.bungee;

public class Bootstrap
{

    public static void main(String[] args) throws Exception
    {
        if ( Float.parseFloat( System.getProperty( "java.class.version" ) ) < 51.0 )
        {
            System.err.println( "*** ERROR *** Ai nevoie de Java 7 sau mai sus pentru a rula!!" );
            System.out.println( "Verifica versiunea ta de java cu: java -version" );
            return;
        }

        BungeeCordLauncher.main( args );
    }
}
