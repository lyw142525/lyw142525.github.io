package Action;
import Entity.Builder;
import Entity.Guitar;
import Entity.Type;
import Entity.Wood;
import Util.SearchBackge;
public class GuitarAction extends BaseAction<Guitar> {
    public String serialNumber;
    public String price;
    public String model;
    private String builder, type, backWood, topWood;
    public void setModel(String model) {
        this.model = model;
    }
    public String getBuilder() {
        return builder;
    }
    public void setBuilder(String builder) {
        this.builder = builder;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBackWood() {
        return backWood;
    }
    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }
    public String getTopWood() {
        return topWood;
    }
    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    public String queryAllGuitar() {
        String builde1r = null;
        String backwood1 = null;
        String topwood2 = null;
        String type1 = null;
        try {
            if (builder != null && !builder.equals("")) {
                if (Builder.valueOf(builder.toUpperCase()) != null) {
                    builde1r = Builder.valueOf(builder.toUpperCase()).toString();
                }
            }
            if (backWood != null && !backWood.equals("")) {
                if (Wood.valueOf(backWood.toUpperCase()) != null) {
                    backwood1 = Wood.valueOf(backWood.toUpperCase()).toString();
                }
            }
            if (topWood != null && !topWood.equals("")) {
                if (Wood.valueOf(topWood.toUpperCase()) != null) {
                    topwood2 = Wood.valueOf(topWood.toUpperCase()).toString();
                }
            }
            if (type != null && !type.equals("")) {
                if (Type.valueOf(type.toUpperCase()) != null) {
                    type1 = Type.valueOf(type.toUpperCase()).toString();
                }
            }
            SearchBackge searchBackge = new SearchBackge();
            String[][] strings = { { "serialNumber", "price", "model", "builder", "type", "backWood", "topWood" },
                    { serialNumber, price, model, builde1r, type1, backwood1, topwood2 } };
            String hql = searchBackge.selectByParam(strings, "Guitar");
            lists = guitarService.queryallGuitar(hql);
            if (lists.size() > 0) {
                if (serialNumber != null) {
                    maps.put("rows", lists);
                } else {
                    Guitar guitar = new Guitar();
                    guitar.setBuilder("这是所有的Guitar");
                    lists.add(guitar);
                    maps.put("rows", lists);
                }
            } else {
                jsonObject.put("serialNumber", "sorry ,nothing exsit to meet you");
                jsonArray.add(jsonObject);
                maps.put("rows", jsonArray);
            }
        } catch (Exception e) {
            // TODO: handle exception
            jsonObject.put("serialNumber", "sorry ,nothing exsit to meet you");
            jsonArray.add(jsonObject);
            maps.put("rows", jsonArray);
        }
        return "maps";
    }
}