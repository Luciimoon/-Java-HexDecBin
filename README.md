# -Java-HexDecBin

CODE BROKEN

FIXED METHOD:

} else if (S_base.equals("quat")) {

            if (E_base.equals("hex")) {
                String convert = String.valueOf(Integer.parseInt(String.valueOf(num), 4));
                System.out.println(Integer.toString(Integer.parseInt(convert), 16));

            } else if (E_base.equals("dec")) {
                System.out.println(Integer.parseInt(String.valueOf(num), 4));

            } else if (E_base.equals("bin")) {

                String convert = String.valueOf(Integer.parseInt(String.valueOf(num), 4));
                System.out.println(Integer.toString(Integer.parseInt(convert), 2));

            } else if (E_base.equals("oct")) {
                String convert = String.valueOf(Integer.parseInt(String.valueOf(num), 4));
                System.out.println(Integer.toString(Integer.parseInt(convert), 8));
            }
