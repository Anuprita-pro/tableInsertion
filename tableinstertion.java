  /* try {
                    MongoClient mongoClient = null;
            DBCursor cursor = null;
                mongoClient = new MongoClient( "localhost" , 27017 );
                DB db = mongoClient.getDB( "sport" );
                DBCollection coll = db.getCollection("AddGame");
                //cursor = coll.find();
                       
        BasicDBObject fields=new BasicDBObject();
        BasicDBObject where=new BasicDBObject();
                  
        String t=jTextField1.getText();
        String r=jTextField2.getText();
         String s=jTextField3.getText();
          fields.put("sname", 1);
           fields.put("scity", 1);
         fields.put("dd", 1);
            fields.put("mm", 1);
            fields.put("yy", 1);
           fields.put("time", 1);
           fields.put("fees", 1);
        
        fields.put("_id", 0);
        where.put("dd",t);
        where.put("mm",r);
         where.put("yy",s);
         

                String[] columnNames = {"sname", "scity","dd","mm","yy", "time","fees"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                
                DBCursor mydoc =coll.find(where,fields);
                
                while(mydoc.hasNext()) {
                    DBObject obj = mydoc.next();
                    String data1 = (String)obj.get("sname");
                        String data2= (String)obj.get("scity");
                            String data3= (String)obj.get("dd");
                    String data4= (String)obj.get("mm");
                        String data5= (String)obj.get("yy");
                    String data6= (String)obj.get("time");
                    String data7= (String)obj.get("fees");
                    //String data5 = (String)obj.get("amount");
                    
                    model.addRow(new Object[] { data1, data2, data3 ,data4,data5,data6,data7});
                }
                jTable1.setModel(model);
               }
                    catch(Exception ex)
                        {
                    
        }*/      
    }       
