
//----------------------------------------------------
// The following code was generated by Java(tm) CUP v0.9d
// Sun Mar 12 20:20:24 MSK 2006
//----------------------------------------------------

package java_cup;

import java_cup.runtime.*;
import java.util.Hashtable;

public class parser extends java_cup.runtime.lr_parser {

  /** constructor */
  public parser() {super();}

  /** production table */
  protected static final short _production_table[][] = {
        {0, 2},     {32, 0},     {1, 10},     {1, 4},     {33, 0}, 
        {2, 4},     {2, 1},     {3, 2},     {3, 1},     {34, 0}, 
        {11, 4},     {4, 2},     {5, 4},     {5, 1},     {6, 4}, 
        {6, 1},     {13, 4},     {13, 1},     {14, 4},     {14, 1}, 
        {16, 4},     {16, 1},     {7, 2},     {7, 1},     {35, 0}, 
        {15, 5},     {36, 0},     {15, 6},     {37, 0},     {15, 4}, 
        {38, 0},     {15, 5},     {18, 3},     {18, 1},     {19, 3}, 
        {19, 1},     {39, 0},     {8, 5},     {8, 1},     {9, 2}, 
        {9, 1},     {40, 0},     {20, 5},     {41, 0},     {20, 3}, 
        {25, 3},     {25, 1},     {26, 1},     {21, 2},     {21, 1}, 
        {22, 2},     {22, 1},     {31, 2},     {31, 1},     {10, 3}, 
        {10, 1},     {12, 3},     {12, 1},     {17, 1},     {23, 1}, 
        {24, 1},     {28, 1},     {29, 1},     {30, 1},     {27, 0}
      };

  /** access to production table */
  public short[][] production_table() {return _production_table;}

  /** parse action table */
  protected static final short[][] _action_table = {
    /*0*/{1,3,2,-2,3,-2,5,-2,6,-2,7,-2,8,-2,9,-2,10,-2,20,-2,-1,0},
    /*1*/{0,120,-1,0},
    /*2*/{7,34,8,36,-1,0},
    /*3*/{2,7,3,-65,5,-65,6,-65,7,-65,8,-65,9,-65,10,-65,20,-65,-1,0},
    /*4*/{3,-65,5,-65,6,-65,7,-65,8,-65,9,-65,10,-65,20,-65,-1,0},
    /*5*/{3,-7,5,-7,6,-7,7,-7,8,-7,9,-7,10,-7,20,-7,-1,0},
    /*6*/{21,8,-1,0},
    /*7*/{13,-56,16,-56,21,-56,-1,0},
    /*8*/{13,-5,16,11,-1,0},
    /*9*/{13,13,-1,0},
    /*10*/{21,12,-1,0},
    /*11*/{13,-55,16,-55,21,-55,-1,0},
    /*12*/{3,-6,5,-6,6,-6,7,-6,8,-6,9,-6,10,-6,20,-6,-1,0},
    /*13*/{3,17,5,18,6,-65,7,-65,8,-65,9,-65,10,-65,20,-65,-1,0},
    /*14*/{3,-9,5,-9,6,-9,7,-9,8,-9,9,-9,10,-9,20,-9,-1,0},
    /*15*/{3,-8,5,-8,6,-8,7,-8,8,-8,9,-8,10,-8,20,-8,-1,0},
    /*16*/{21,8,-1,0},
    /*17*/{4,108,-1,0},
    /*18*/{6,103,7,-65,8,-65,9,-65,10,-65,20,-65,-1,0},
    /*19*/{6,-14,7,-14,8,-14,9,-14,10,-14,20,-14,-1,0},
    /*20*/{7,-65,8,-65,9,-65,10,-65,20,22,-1,0},
    /*21*/{11,99,-1,0},
    /*22*/{7,-22,8,-22,9,-22,10,-22,-1,0},
    /*23*/{7,-65,8,-65,9,25,10,-65,-1,0},
    /*24*/{11,96,-1,0},
    /*25*/{7,-65,8,-65,10,29,-1,0},
    /*26*/{7,-18,8,-18,10,-18,-1,0},
    /*27*/{7,34,8,36,-1,0},
    /*28*/{11,31,-1,0},
    /*29*/{7,-20,8,-20,-1,0},
    /*30*/{22,32,-1,0},
    /*31*/{13,33,-1,0},
    /*32*/{7,-19,8,-19,-1,0},
    /*33*/{1,85,21,8,-1,0},
    /*34*/{1,-24,7,-24,8,-24,12,-24,21,-24,-1,0},
    /*35*/{7,72,-1,0},
    /*36*/{1,-65,7,34,8,36,12,41,21,-65,-1,0},
    /*37*/{1,47,21,43,-1,0},
    /*38*/{1,-39,21,-39,-1,0},
    /*39*/{1,-23,7,-23,8,-23,12,-23,21,-23,-1,0},
    /*40*/{11,42,-1,0},
    /*41*/{21,43,-1,0},
    /*42*/{13,-62,18,-62,-1,0},
    /*43*/{13,-37,-1,0},
    /*44*/{13,46,-1,0},
    /*45*/{1,-38,21,-38,-1,0},
    /*46*/{13,-44,-1,0},
    /*47*/{18,-42,-1,0},
    /*48*/{0,-3,1,47,21,43,-1,0},
    /*49*/{0,-41,1,-41,21,-41,-1,0},
    /*50*/{0,-40,1,-40,21,-40,-1,0},
    /*51*/{18,53,-1,0},
    /*52*/{13,-65,19,-65,21,-65,22,-65,-1,0},
    /*53*/{13,68,19,67,-1,0},
    /*54*/{13,-50,19,-50,21,-50,22,-50,-1,0},
    /*55*/{13,-48,19,-48,21,59,22,58,-1,0},
    /*56*/{13,-47,19,-47,-1,0},
    /*57*/{13,-52,19,-52,21,-52,22,-52,-1,0},
    /*58*/{13,-63,17,-63,19,-63,21,-63,22,-63,-1,0},
    /*59*/{13,-65,17,62,19,-65,21,-65,22,-65,-1,0},
    /*60*/{13,-49,19,-49,21,-49,22,-49,-1,0},
    /*61*/{21,65,-1,0},
    /*62*/{13,-54,19,-54,21,-54,22,-54,-1,0},
    /*63*/{13,-51,19,-51,21,-51,22,-51,-1,0},
    /*64*/{13,-64,21,-64,22,-64,-1,0},
    /*65*/{13,-53,21,-53,22,-53,-1,0},
    /*66*/{13,-65,19,-65,21,-65,22,-65,-1,0},
    /*67*/{0,-43,1,-43,21,-43,-1,0},
    /*68*/{13,-46,19,-46,-1,0},
    /*69*/{13,71,-1,0},
    /*70*/{0,-45,1,-45,21,-45,-1,0},
    /*71*/{1,73,21,8,-1,0},
    /*72*/{13,-31,-1,0},
    /*73*/{16,11,21,-59,-1,0},
    /*74*/{21,76,-1,0},
    /*75*/{13,-61,14,-61,-1,0},
    /*76*/{13,-27,14,79,-1,0},
    /*77*/{13,-36,14,-36,-1,0},
    /*78*/{21,76,-1,0},
    /*79*/{13,81,-1,0},
    /*80*/{1,-28,7,-28,8,-28,12,-28,21,-28,-1,0},
    /*81*/{13,-35,14,-35,-1,0},
    /*82*/{13,84,-1,0},
    /*83*/{1,-32,7,-32,8,-32,12,-32,21,-32,-1,0},
    /*84*/{13,-29,-1,0},
    /*85*/{21,87,-1,0},
    /*86*/{13,-60,14,-60,-1,0},
    /*87*/{13,-34,14,-34,-1,0},
    /*88*/{13,-25,14,91,-1,0},
    /*89*/{13,93,-1,0},
    /*90*/{21,87,-1,0},
    /*91*/{13,-33,14,-33,-1,0},
    /*92*/{1,-26,7,-26,8,-26,12,-26,21,-26,-1,0},
    /*93*/{13,95,-1,0},
    /*94*/{1,-30,7,-30,8,-30,12,-30,21,-30,-1,0},
    /*95*/{22,97,-1,0},
    /*96*/{13,98,-1,0},
    /*97*/{7,-17,8,-17,10,-17,-1,0},
    /*98*/{21,8,-1,0},
    /*99*/{13,101,16,11,-1,0},
    /*100*/{7,-21,8,-21,9,-21,10,-21,-1,0},
    /*101*/{7,-16,8,-16,9,-16,10,-16,20,-16,-1,0},
    /*102*/{4,105,-1,0},
    /*103*/{7,-12,8,-12,9,-12,10,-12,20,-12,-1,0},
    /*104*/{22,106,-1,0},
    /*105*/{13,107,-1,0},
    /*106*/{7,-15,8,-15,9,-15,10,-15,20,-15,-1,0},
    /*107*/{22,109,-1,0},
    /*108*/{13,110,-1,0},
    /*109*/{6,-13,7,-13,8,-13,9,-13,10,-13,20,-13,-1,0},
    /*110*/{13,-58,16,115,-1,0},
    /*111*/{13,-10,-1,0},
    /*112*/{13,114,-1,0},
    /*113*/{3,-11,5,-11,6,-11,7,-11,8,-11,9,-11,10,-11,20,-11,-1,0},
    /*114*/{15,116,21,12,-1,0},
    /*115*/{13,-57,-1,0},
    /*116*/{1,-65,7,34,8,36,12,41,21,-65,-1,0},
    /*117*/{1,47,21,43,-1,0},
    /*118*/{0,-4,1,47,21,43,-1,0},
    /*119*/{0,-1,-1,0},
  };

  /** access to parse action table */
  public short[][] action_table() {return _action_table;}

  /** reduce_goto table */
  protected static final short[][] _reduce_table = {
    /*0*/{1,1,32,3,-1,-1},
    /*1*/{-1,-1},
    /*2*/{7,116,15,34,-1,-1},
    /*3*/{2,4,27,5,-1,-1},
    /*4*/{3,13,27,14,-1,-1},
    /*5*/{-1,-1},
    /*6*/{10,8,-1,-1},
    /*7*/{-1,-1},
    /*8*/{33,9,-1,-1},
    /*9*/{-1,-1},
    /*10*/{-1,-1},
    /*11*/{-1,-1},
    /*12*/{-1,-1},
    /*13*/{4,20,5,18,11,15,27,19,-1,-1},
    /*14*/{-1,-1},
    /*15*/{-1,-1},
    /*16*/{10,110,12,111,-1,-1},
    /*17*/{-1,-1},
    /*18*/{6,103,27,101,-1,-1},
    /*19*/{-1,-1},
    /*20*/{16,23,27,22,-1,-1},
    /*21*/{-1,-1},
    /*22*/{-1,-1},
    /*23*/{13,25,27,26,-1,-1},
    /*24*/{-1,-1},
    /*25*/{14,27,27,29,-1,-1},
    /*26*/{-1,-1},
    /*27*/{7,36,15,34,-1,-1},
    /*28*/{-1,-1},
    /*29*/{-1,-1},
    /*30*/{-1,-1},
    /*31*/{-1,-1},
    /*32*/{-1,-1},
    /*33*/{10,73,17,85,-1,-1},
    /*34*/{-1,-1},
    /*35*/{-1,-1},
    /*36*/{8,37,15,39,27,38,-1,-1},
    /*37*/{9,48,20,49,28,47,-1,-1},
    /*38*/{-1,-1},
    /*39*/{-1,-1},
    /*40*/{-1,-1},
    /*41*/{28,43,-1,-1},
    /*42*/{-1,-1},
    /*43*/{39,44,-1,-1},
    /*44*/{-1,-1},
    /*45*/{-1,-1},
    /*46*/{41,69,-1,-1},
    /*47*/{40,51,-1,-1},
    /*48*/{20,50,28,47,-1,-1},
    /*49*/{-1,-1},
    /*50*/{-1,-1},
    /*51*/{-1,-1},
    /*52*/{21,55,25,53,26,56,27,54,-1,-1},
    /*53*/{-1,-1},
    /*54*/{-1,-1},
    /*55*/{22,60,29,59,-1,-1},
    /*56*/{-1,-1},
    /*57*/{-1,-1},
    /*58*/{-1,-1},
    /*59*/{27,62,31,63,-1,-1},
    /*60*/{-1,-1},
    /*61*/{30,65,-1,-1},
    /*62*/{-1,-1},
    /*63*/{-1,-1},
    /*64*/{-1,-1},
    /*65*/{-1,-1},
    /*66*/{21,55,26,68,27,54,-1,-1},
    /*67*/{-1,-1},
    /*68*/{-1,-1},
    /*69*/{-1,-1},
    /*70*/{-1,-1},
    /*71*/{10,73,17,74,-1,-1},
    /*72*/{38,82,-1,-1},
    /*73*/{-1,-1},
    /*74*/{19,76,24,77,-1,-1},
    /*75*/{-1,-1},
    /*76*/{36,79,-1,-1},
    /*77*/{-1,-1},
    /*78*/{24,81,-1,-1},
    /*79*/{-1,-1},
    /*80*/{-1,-1},
    /*81*/{-1,-1},
    /*82*/{-1,-1},
    /*83*/{-1,-1},
    /*84*/{37,93,-1,-1},
    /*85*/{18,88,23,87,-1,-1},
    /*86*/{-1,-1},
    /*87*/{-1,-1},
    /*88*/{35,89,-1,-1},
    /*89*/{-1,-1},
    /*90*/{23,91,-1,-1},
    /*91*/{-1,-1},
    /*92*/{-1,-1},
    /*93*/{-1,-1},
    /*94*/{-1,-1},
    /*95*/{-1,-1},
    /*96*/{-1,-1},
    /*97*/{-1,-1},
    /*98*/{10,99,-1,-1},
    /*99*/{-1,-1},
    /*100*/{-1,-1},
    /*101*/{-1,-1},
    /*102*/{-1,-1},
    /*103*/{-1,-1},
    /*104*/{-1,-1},
    /*105*/{-1,-1},
    /*106*/{-1,-1},
    /*107*/{-1,-1},
    /*108*/{-1,-1},
    /*109*/{-1,-1},
    /*110*/{-1,-1},
    /*111*/{34,112,-1,-1},
    /*112*/{-1,-1},
    /*113*/{-1,-1},
    /*114*/{-1,-1},
    /*115*/{-1,-1},
    /*116*/{8,117,15,39,27,38,-1,-1},
    /*117*/{9,118,20,49,28,47,-1,-1},
    /*118*/{20,50,28,47,-1,-1},
    /*119*/{-1,-1},
  };

  /** access to reduce_goto table */
  public short[][] reduce_table() {return _reduce_table;}

  /** instance of action encapsulation class */
  protected CUP$actions action_obj;

  /** action encapsulation object initializer */
  protected void init_actions()
    {
      action_obj = new CUP$actions();
    }

  /** invoke a user supplied parse action */
  public java_cup.runtime.symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$do_action(act_num, parser, stack, top);
  }

  /** start state */
  public int start_state() {return 0;}
  /** start production */
  public int start_production() {return 0;}

  /** EOF symbol index */
  public int EOF_sym() {return 0;}

  /** error symbol index */
  public int error_sym() {return 1;}


  /** user initialization */
  public void user_init() throws java.lang.Exception
    {
 lexer.init(); 
    }

  /** scan to get the next token */
  public java_cup.runtime.token scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }



  /* override error routines */

  public void report_fatal_error(
    String   message,
    Object   info)
    {
      done_parsing();
      lexer.emit_error(message);
      System.err.println("Can't recover from previous error(s), giving up.");
      System.exit(1);
    }

    public void report_error(String message, Object info)
    {
      lexer.emit_error(message);
    }

};

/** JavaCup generated class to encapsulate user supplied action code.*/
class CUP$actions {


  /** helper routine to clone a new production part adding a given label */
  protected production_part add_lab(production_part part, String lab)
    throws internal_error
    {
      /* if there is no label, or this is an action, just return the original */
      if (lab == null || part.is_action()) return part;

      /* otherwise build a new one with the given label attached */
      return new symbol_part(((symbol_part)part).the_symbol(),lab);
    }

  /** max size of right hand side we will support */
  protected final int MAX_RHS = 200;

  /** array for accumulating right hand side parts */
  protected production_part[] rhs_parts = new production_part[MAX_RHS];

  /** where we are currently in building a right hand side */
  protected int rhs_pos = 0;

  /** start a new right hand side */
  protected void new_rhs() {rhs_pos = 0; }

  /** add a new right hand side part */
  protected void add_rhs_part(production_part part) throws java.lang.Exception
    {
      if (rhs_pos >= MAX_RHS)
	throw new Exception("Internal Error: Productions limited to " +
			     MAX_RHS + " symbols and actions");

      rhs_parts[rhs_pos] = part;
      rhs_pos++;
    }

  /** string to build up multiple part names */
  protected String multipart_name = new String();

  /** append a new name segment to the accumulated multipart name */
  protected void append_multipart(String name)
    {
      String dot = "";

      /* if we aren't just starting out, put on a dot */
      if (multipart_name.length() != 0)  dot = ".";

      multipart_name = multipart_name.concat(dot + name);
    }

  /** table of declared symbols -- contains production parts indexed by name */
  protected Hashtable symbols = new Hashtable();

  /** table of just non terminals -- contains non_terminals indexed by name */
  protected Hashtable non_terms = new Hashtable();

  /** declared start non_terminal */
  protected non_terminal start_nt = null;

  /** left hand side non terminal of the current production */
  protected non_terminal lhs_nt;



  /** Constructor */
  CUP$actions() { }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.symbol CUP$do_action(
    int                        CUP$act_num,
    java_cup.runtime.lr_parser CUP$parser,
    java.util.Stack            CUP$stack,
    int                        CUP$top)
    throws java.lang.Exception
    {
      /* object for return from actions */
      java_cup.runtime.symbol CUP$result;

      /* select the action based on the action number */
      switch (CUP$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // empty ::= 
            {
              CUP$result = new java_cup.runtime.symbol(/*empty*/27);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // label_id ::= ID 
            {
              CUP$result = new java_cup.runtime.str_token(/*label_id*/30);
               ((java_cup.runtime.str_token)CUP$result).str_val = (/*the_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // symbol_id ::= ID 
            {
              CUP$result = new java_cup.runtime.str_token(/*symbol_id*/29);
               ((java_cup.runtime.str_token)CUP$result).str_val = (/*the_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // nt_id ::= ID 
            {
              CUP$result = new java_cup.runtime.str_token(/*nt_id*/28);
               ((java_cup.runtime.str_token)CUP$result).str_val = (/*the_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // new_non_term_id ::= ID 
            {
              CUP$result = new java_cup.runtime.symbol(/*new_non_term_id*/24);
              
	  /* see if this non terminal has been declared before */
	  if (symbols.get((/*non_term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val) != null)
	    {
	      /* issue a message */
	      lexer.emit_error( "Symbol \"" + (/*non_term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val +
			                      "\" has already been declared");
	    }
	  else
	    {
	      /* build the non terminal object */
              non_terminal this_nt =
		new non_terminal((/*non_term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val, multipart_name);

	      /* put it in the non_terms table */
	      non_terms.put((/*non_term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val, this_nt);

	      /* build a production_part and put it in the symbols table */
	      symbols.put((/*non_term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val, new symbol_part(this_nt));
	    }
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // new_term_id ::= ID 
            {
              CUP$result = new java_cup.runtime.symbol(/*new_term_id*/23);
              
	  /* see if this terminal has been declared before */
	  if (symbols.get((/*term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val) != null)
	    {
	      /* issue a message */
	      lexer.emit_error("Symbol \"" + (/*term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val +
			   "\" has already been declared");
	    }
	  else
	    {
	      /* build a production_part and put it in the table */
	      symbols.put((/*term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val,
	        new symbol_part(new terminal((/*term_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val, multipart_name)));
	    }
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // type_id ::= multipart_id 
            {
              CUP$result = new java_cup.runtime.symbol(/*type_id*/17);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // import_id ::= multipart_id 
            {
              CUP$result = new java_cup.runtime.symbol(/*import_id*/12);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // import_id ::= multipart_id DOT STAR 
            {
              CUP$result = new java_cup.runtime.symbol(/*import_id*/12);
               append_multipart("*"); 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // multipart_id ::= ID 
            {
              CUP$result = new java_cup.runtime.symbol(/*multipart_id*/10);
               append_multipart((/*an_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val); 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // multipart_id ::= multipart_id DOT ID 
            {
              CUP$result = new java_cup.runtime.symbol(/*multipart_id*/10);
               append_multipart((/*another_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val); 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // opt_label ::= empty 
            {
              CUP$result = new java_cup.runtime.str_token(/*opt_label*/31);
               ((java_cup.runtime.str_token)CUP$result).str_val = null; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // opt_label ::= COLON label_id 
            {
              CUP$result = new java_cup.runtime.str_token(/*opt_label*/31);
               ((java_cup.runtime.str_token)CUP$result).str_val = (/*labid*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // prod_part ::= CODE_STRING 
            {
              CUP$result = new java_cup.runtime.symbol(/*prod_part*/22);
              
	  /* add a new production part */
	  add_rhs_part(new action_part((/*code_str*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val));
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // prod_part ::= symbol_id opt_label 
            {
              CUP$result = new java_cup.runtime.symbol(/*prod_part*/22);
              
	  /* try to look up the id */
	  production_part symb = (production_part)symbols.get((/*symid*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-1)).str_val);

	  /* if that fails, symbol is undeclared */
	  if (symb == null)
	    {
	      if (lexer.error_count == 0)
	        lexer.emit_error("Symbol \"" + (/*symid*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-1)).str_val +
			       "\" has not been declared");
	    }
	  else
	    {
	      /* add a labeled production part */
	      add_rhs_part(add_lab(symb, (/*labid*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val));
	    }
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // prod_part_list ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*prod_part_list*/21);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // prod_part_list ::= prod_part_list prod_part 
            {
              CUP$result = new java_cup.runtime.symbol(/*prod_part_list*/21);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // rhs ::= prod_part_list 
            {
              CUP$result = new java_cup.runtime.symbol(/*rhs*/26);
              
	  if (lhs_nt != null)
	    {
	      /* build the production */
	      production p = new production(lhs_nt, rhs_parts, rhs_pos);

	      /* if we have no start non-terminal declared and this is
		 the first production, make its lhs nt the start_nt
		 and build a special start production for it. */
              if (start_nt == null)
		{
		  start_nt = lhs_nt;

	          /* build a special start production */
	          new_rhs();
	          add_rhs_part(new symbol_part(start_nt));
	          add_rhs_part(new symbol_part(terminal.EOF));
	          emit.start_production =
		     new production(non_terminal.START_nt, rhs_parts, rhs_pos);
	          new_rhs();
		}
	    }

	  /* reset the rhs accumulation in any case */
	  new_rhs();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // rhs_list ::= rhs 
            {
              CUP$result = new java_cup.runtime.symbol(/*rhs_list*/25);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // rhs_list ::= rhs_list BAR rhs 
            {
              CUP$result = new java_cup.runtime.symbol(/*rhs_list*/25);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // production ::= error NT$9 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*production*/20);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // NT$9 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$9*/41);
               lexer.emit_error("Syntax Error"); 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // production ::= nt_id NT$8 COLON_COLON_EQUALS rhs_list SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*production*/20);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // NT$8 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$8*/40);
              
	  /* lookup the lhs nt */
	  lhs_nt = (non_terminal)non_terms.get((/*lhs_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val);

          /* if it wasn't declared, emit a message */
	  if (lhs_nt == null)
	    {
	      if (lexer.error_count == 0)
	        lexer.emit_error("LHS non terminal \"" + (/*lhs_id*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val +
			       "\" has not been declared");
	    }

	  /* reset the rhs accumulation */
	  new_rhs();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // production_list ::= production 
            {
              CUP$result = new java_cup.runtime.symbol(/*production_list*/9);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // production_list ::= production_list production 
            {
              CUP$result = new java_cup.runtime.symbol(/*production_list*/9);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // start_spec ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*start_spec*/8);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // start_spec ::= START WITH nt_id NT$7 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*start_spec*/8);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // NT$7 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$7*/39);
              
	  /* verify that the name has been declared as a non terminal */
	  non_terminal nt = (non_terminal)non_terms.get((/*start_name*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
	  if (nt == null)
	    {
	      lexer.emit_error( "Start non terminal \"" + (/*start_name*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-0)).str_val +
	  		         "\" has not been declared");
	    }
          else
	    {
	      /* remember the non-terminal for later */
	      start_nt = nt;

	      /* build a special start production */
	      new_rhs();
	      add_rhs_part(new symbol_part(start_nt));
	      add_rhs_part(new symbol_part(terminal.EOF));
	      emit.start_production =
		     new production(non_terminal.START_nt, rhs_parts, rhs_pos);
	      new_rhs();
	    }
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // non_term_name_list ::= new_non_term_id 
            {
              CUP$result = new java_cup.runtime.symbol(/*non_term_name_list*/19);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // non_term_name_list ::= non_term_name_list COMMA new_non_term_id 
            {
              CUP$result = new java_cup.runtime.symbol(/*non_term_name_list*/19);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // term_name_list ::= new_term_id 
            {
              CUP$result = new java_cup.runtime.symbol(/*term_name_list*/18);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // term_name_list ::= term_name_list COMMA new_term_id 
            {
              CUP$result = new java_cup.runtime.symbol(/*term_name_list*/18);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // symbol ::= NON TERMINAL error NT$6 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*symbol*/15);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // NT$6 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$6*/38);
              
	  /* reset the accumulated multipart name */
	  multipart_name = new String();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // symbol ::= TERMINAL error NT$5 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*symbol*/15);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // NT$5 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$5*/37);
              
	  /* reset the accumulated multipart name */
	  multipart_name = new String();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // symbol ::= NON TERMINAL type_id non_term_name_list NT$4 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*symbol*/15);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // NT$4 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$4*/36);
              
	  /* reset the accumulated multipart name */
	  multipart_name = new String();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // symbol ::= TERMINAL type_id term_name_list NT$3 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*symbol*/15);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // NT$3 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$3*/35);
              
	  /* reset the accumulated multipart name */
	  multipart_name = new String();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // symbol_list ::= symbol 
            {
              CUP$result = new java_cup.runtime.symbol(/*symbol_list*/7);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // symbol_list ::= symbol_list symbol 
            {
              CUP$result = new java_cup.runtime.symbol(/*symbol_list*/7);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // debug_grammar ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*debug_grammar*/16);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // debug_grammar ::= DEBUG WITH multipart_id SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*debug_grammar*/16);
              
	  /* save the procedure name */
          emit.debug_grammar = multipart_name;
          /* reset the accumulated multipart name */
          multipart_name = new String();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // scan_code ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*scan_code*/14);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // scan_code ::= SCAN WITH CODE_STRING SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*scan_code*/14);
              
	  /* save the user code */
	  emit.scan_code = (/*user_code*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-1)).str_val;
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // init_code ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*init_code*/13);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // init_code ::= INIT WITH CODE_STRING SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*init_code*/13);
              
	  /* save the user code */
	  emit.init_code = (/*user_code*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-1)).str_val;
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // parser_code_part ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*parser_code_part*/6);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // parser_code_part ::= PARSER CODE CODE_STRING SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*parser_code_part*/6);
              
	  /* save the user included code string */
	  emit.parser_code = (/*user_code*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-1)).str_val;
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // action_code_part ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*action_code_part*/5);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // action_code_part ::= ACTION CODE CODE_STRING SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*action_code_part*/5);
              
	  /* save the user included code string */
	  emit.action_code = (/*user_code*/(java_cup.runtime.str_token)CUP$stack.elementAt(CUP$top-1)).str_val;
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // code_part ::= action_code_part parser_code_part 
            {
              CUP$result = new java_cup.runtime.symbol(/*code_part*/4);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // import_spec ::= IMPORT import_id NT$2 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*import_spec*/11);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$2 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$2*/34);
              
	  /* save this import on the imports list */
	  emit.import_list.push(multipart_name);

	  /* reset the accumulated multipart name */
	  multipart_name = new String();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // import_list ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*import_list*/3);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // import_list ::= import_list import_spec 
            {
              CUP$result = new java_cup.runtime.symbol(/*import_list*/3);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // package_spec ::= empty 
            {
              CUP$result = new java_cup.runtime.symbol(/*package_spec*/2);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // package_spec ::= PACKAGE multipart_id NT$1 SEMI 
            {
              CUP$result = new java_cup.runtime.symbol(/*package_spec*/2);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$1 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$1*/33);
              
	  /* save the package name */
	  emit.package_name = multipart_name;

	  /* reset the accumulated multipart name */
	  multipart_name = new String();
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // spec ::= error symbol_list start_spec production_list 
            {
              CUP$result = new java_cup.runtime.symbol(/*spec*/1);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // spec ::= NT$0 package_spec import_list code_part debug_grammar init_code scan_code symbol_list start_spec production_list 
            {
              CUP$result = new java_cup.runtime.symbol(/*spec*/1);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$0*/32);
              
          /* declare "error" as a terminal */
          symbols.put("error", new symbol_part(terminal.error));

          /* declare start non terminal */
          non_terms.put("$START", non_terminal.START_nt);
	
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= spec EOF 
            {
              CUP$result = new java_cup.runtime.token(/*$START*/0);
              
            }
          /* ACCEPT */
          CUP$parser.done_parsing();
          return CUP$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
};

