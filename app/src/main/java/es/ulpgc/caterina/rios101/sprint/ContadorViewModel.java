package es.ulpgc.caterina.rios101.sprint;

import java.util.Objects;

public class ContadorViewModel {

    public String data;
    public int contador = 0;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ContadorViewModel viewModel = (ContadorViewModel) obj;
        return contador == viewModel.contador && Objects.equals(data, viewModel.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contador, data);
    }
}
