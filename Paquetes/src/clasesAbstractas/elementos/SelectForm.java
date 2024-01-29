package clasesAbstractas.elementos;

import clasesAbstractas.elementos.selec.Option;
import java.util.ArrayList;
import java.util.List;
public class SelectForm extends ElementoFom {

    private final List<Option> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones= new ArrayList<>();
    }

    public void addOpcion(Option option){
        this.opciones.add(option);
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='").append(this.nombre).append("'>");

        for (Option option: this.opciones){
            sb.append("\n<option value='").append(option.getValor()).append("'");
            if (option.isSelected()) {
               sb.append(" selected");
            }
            sb.append(">").append(option.getNombre()).append("</option>");
        }
        sb.append("</select>");
        return null;
    }
}
