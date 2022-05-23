
# Rapport


Jag valde att skapa en app som presenterar information om giftiga/dödliga svampar som finns i Sverige. I figur 1 visas ett JSON-objekt upp från min JSON-array.
Varje JSON-objekt har attributen "ID", "name", "type", "location", "category" och "auxdata". Attributet "type" innehåller mitt Login 

Jag valde att använda attributen "ID", "name", "type", "location", "category" och "auxdata".
Figur 1
```
{"ID":"svamp_lomFlug", 
"name":"Lömsk flugsvamp",
"type":"b21emmbj",
"company":"",
"location":"Dödlig",
"category":"Skadar levern och tarmslemhinnan",
"size":0,
"cost":0,
"auxdata":"Utseende: Vit fot med en grönaktig välvd hatt, lätt att förväxla med den ätliga grönkremlan."}
```
Med denna metod som presenteras i figur 2 så sätts (assigns) 
Figur 2
```
   public void setSvamps(List<Svamp> svamps) {
        this.svamps = svamps;
    }
```
Figur 3
```
    private final String JSON_URL = "https://mobprog.webug.se/json-api/getdataasjson.php?type=b21emmbj";
    private List<Svamp> listofSvampar;
    private Myadapter adapter;
    ...
    protected void onCreate(Bundle savedInstanceState) {
        new JsonTask(this).execute(JSON_URL);
    ...
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Svamp>>() {}.getType();
        listofSvampar = gson.fromJson(json, type);
        adapter.setSvamps(listofSvampar);
        adapter.notifyDataSetChanged();
    }
```


Figur 4
```
...// från res/values/string.xml
    <string name="hyperLink">Bakgrundsbild på startsidan: <a href="https://unsplash.com/photos/4eeG4Mn0HVY">källa</a></string>
...
   // från SecondActivity.java
    private void setupHyperLink() {
        TextView linkTextView = findViewById(R.id.img_source);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLUE);
    }
```
Vad var jobbigt? Vad var roligt?

## Skärmbild från första aktiviteten
![](first.png)

## Skärmbild från andra aktiviteten ("Om oss")
![](second.png)

