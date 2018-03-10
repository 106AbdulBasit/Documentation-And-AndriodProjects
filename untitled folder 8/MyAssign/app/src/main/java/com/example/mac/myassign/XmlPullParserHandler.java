package com.example.mac.myassign;


        import org.xmlpull.v1.XmlPullParser;
        import org.xmlpull.v1.XmlPullParserException;
        import org.xmlpull.v1.XmlPullParserFactory;

        import java.io.IOException;
        import java.io.InputStream;
        import java.util.ArrayList;
        import java.util.List;

/**
 * Created by Umer Rana on 28/10/2016.
 */
public class XmlPullParserHandler{
    int tag = 1;
    private List<Book> employees= new ArrayList<Book>();
    // private List<Author> employees1= new ArrayList<Author>();
    private Book employee;
    // private Author employee1;
    private String text;
    public List<Book> getEmployees() {
        return employees;
    }
    public List<Book> parse(InputStream is) {
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(is, null);
            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagname = parser.getName();
                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if (tagname.equalsIgnoreCase("book")) {
                            // create a new instance of employee
                            employee = new Book();
                        }
                        break;
                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;
                    case XmlPullParser.END_TAG:
                        if (tagname.equalsIgnoreCase("id")) {
                            employee.setId(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("name")) {
                            employee.setName(text);
                        } else if (tagname.equalsIgnoreCase("price")) {
                            employee.setPrice(Integer.parseInt(text));

                            //  int eventType1 = parser.next();
                            // parse1(eventType1);
                            //  int eventType1 = parser.getEventType();
                            //   while (eventType != XmlPullParser.END_DOCUMENT) {
                            //String tagname1 = parser.getName();
                            eventType = parser.next();
                            switch (eventType) {
                                case XmlPullParser.START_TAG:
                                    if (tagname.equalsIgnoreCase("authors")) {
                                        // create a new instance of employee
                                        employee = new Book();
                                    }
                                    break;
                                case XmlPullParser.TEXT:
                                    text = parser.getText();
                                    break;
                                case XmlPullParser.END_TAG:
                                    if (tagname.equalsIgnoreCase("author")) {
                                        employee.setAuthorname1(text);
                                    } else if (tagname.equalsIgnoreCase("author")) {
                                        employee.setAuthorname2(text);
                                    } else if (tagname.equalsIgnoreCase("author")) {
                                        employee.setAuthorname3(text);
                                    }
                                    break;
                            }
                            //Start Authors

                            //    int eventType1 = parser.next();
                            // add employee object to list
                          /*  while (eventType != XmlPullParser.END_DOCUMENT) {
                                 tagname = parser.getName();
                                switch (eventType) {
                                    case XmlPullParser.START_TAG:
                                        if (tagname.equalsIgnoreCase("authors")) {
                                            // create a new instance of employee
                                            if (tagname.equalsIgnoreCase("author") && tag ==1) {
                                                employee.setAuthorname1(text);
                                                tag =2;
                                            } else if (tagname.equalsIgnoreCase("author")&& tag ==2) {
                                                employee.setAuthorname2(text);
                                                tag = 3;
                                            } else if (tagname.equalsIgnoreCase("author")&& tag ==3) {
                                                employee.setAuthorname3(text);
                                                tag = 1;
                                            }
                                        }
                                        break;
                                    case XmlPullParser.TEXT:
                                        text = parser.getText();
                                        break;
                                    case XmlPullParser.END_TAG:
                                        if (tagname.equalsIgnoreCase("auhtors")) {
                                            // add employee object to list
                                            employees.add(employee);
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                eventType = parser.next();
                            }

                            //End Authors
*/
                        }else if (tagname.equalsIgnoreCase("book")) {
                            // add employee object to list
                            employees.add(employee);
                        }
                        break;
                    default:
                        break;
                }
                eventType = parser.next();
            }
        } catch (XmlPullParserException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
        catch (Exception e) {e.printStackTrace();}
        return employees;
    }
  /*  public List<Book> parse1( int eventType2) {
        while (eventType2 != XmlPullParser.END_DOCUMENT) {
           String tagname = parser.getName();
            switch (eventType2) {
                case XmlPullParser.START_TAG:
                    if (tagname.equalsIgnoreCase("authors")) {
                        // create a new instance of employee
                        if (tagname.equalsIgnoreCase("author") && tag == 1) {
                            employee.setAuthorname1(text);
                            tag = 2;
                        } else if (tagname.equalsIgnoreCase("author") && tag == 2) {
                            employee.setAuthorname2(text);
                            tag = 3;
                        } else if (tagname.equalsIgnoreCase("author") && tag == 3) {
                            employee.setAuthorname3(text);
                            tag = 1;
                        }
                    }
                    break;
                case XmlPullParser.TEXT:
                    text = parser.getText();
                    break;
                case XmlPullParser.END_TAG:
                    if (tagname.equalsIgnoreCase("auhtors")) {
                        // add employee object to list
                    }
                    break;
                default:
                    break;
            }
            eventType2 = parser.next();
        }
    return employees;
    }*/
}
