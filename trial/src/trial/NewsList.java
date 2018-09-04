package trial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;




import java.util.ArrayList;
import java.io.*;

import org.json.JSONArray;


import trial.pojo.TestPojo;

public class NewsList {
	
	public static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
          sb.append((char) cp);
        }
        return sb.toString();
      }

      public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
          BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
          String jsonText = readAll(rd);
          JSONObject json = new JSONObject(jsonText);
          return json;
        } finally {
          is.close();
        }
      }

	
    public static ArrayList<TestPojo> getAllNews() throws IOException, JSONException  {
        ArrayList<TestPojo> list=new ArrayList<>();
        String title;
      int id;
          //JSONObject json = readJsonFromUrl("https://powerful-tor-13817.herokuapp.com/live");
                        try{
          JSONObject json1 = readJsonFromUrl("https://powerful-tor-13817.herokuapp.com/news");
          //JSONObject json2= new JSONObject(json1.getJSONArray("Latest News"));
          //System.out.println(json2.getJSONObject(0).);
                        
                        
          //String a=json1.toString();
          //Object obj=parser.parse(a);
          
          //System.out.println(json.getString("ID"));
            JSONArray jsonarray1=json1.getJSONArray("Latest News");
            //System.out.println(jsonarray1);
            
            for (int index = 0, total = 10; index < total; index++) {
                final JSONObject jsonObject = jsonarray1.getJSONObject(index);
               
                
                title=jsonObject.getString("Title");
                id=index;
                
                TestPojo ob=new TestPojo(id,title);
                list.add(ob);
                System.out.println(ob);
                
            }
            TestPojo flag=new TestPojo(-1000,"Live Data Received");
            list.add(flag);
                        }
                        catch(Exception e)
            {
                        System.out.println("exception caught");
                        System.out.println("printing past news");
                       
                       /* 
                        String contents = new String(Files.readAllBytes(Paths.get("news.json"))); 
                        System.out.println("Contents (Java 7) : " + contents);

                        JSONObject jsonObj = new JSONObject(contents);
                        JSONArray jsonarray1=jsonObj.getJSONArray("Latest News");
                        String name1,name2;
                        for (int index = 0, total = 5; index < total; index++) {
                    final JSONObject jsonObject = jsonarray1.getJSONObject(index);
                   
                    title=jsonObject.getString("Title");
                                id=index;
                                
                                News ob=new News(id,title);
                                list.add(ob);
                                System.out.println(ob);*/
               /*     
                }
                        News flag=new News(-999,"Failed to Connect Showing Past News, try Refreshing the Page or Restating the Server");
                            list.add(flag);*/
            }
                        return list;

    }

	

	

	
}
