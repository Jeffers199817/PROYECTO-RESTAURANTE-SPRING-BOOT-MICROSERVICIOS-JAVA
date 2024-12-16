package com.milenyumsoft.restaurantemenu.service;
import com.milenyumsoft.restaurantemenu.model.Ingrediente;
import com.milenyumsoft.restaurantemenu.repository.IMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.milenyumsoft.restaurantemenu.model.Menu;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class MenuService implements IMenuService{

   @Autowired
    private IMenuRepository menuRepository;
   @Autowired
   private RestTemplate consumirApi;


    @Override
    public void createdMenu(Menu menu) {

        String nombrePlato = menu.getNombrePlato();

       List<Map<String,Object>> listaIngrediente=  consumirApi.getForObject("http://localhost:9001/ingrediente/listar/ingredientes/nombreplato/"+nombrePlato , List.class);

       for(Map<String, Object> ingrediente: listaIngrediente) {
              menu.getListaIngredientes().add((String) ingrediente.get("nombre_ingrediente"));
       }


        menuRepository.save(menu);

    }

    @Override
    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);

    }

    @Override
    public List<Menu> getMenus() {
        return menuRepository.findAll();
    }

    @Override
    public Menu getMenu(Long id) {
        return menuRepository.findById(id).get();
    }

    @Override
    public Menu updateMenu(Menu menu) {

        Menu men = menuRepository.findById(menu.getIdPlato()).get();

        men.setNumeroPlato(men.getNumeroPlato());
        men.setNombrePlato(men.getNombrePlato());
        men.setPrecioPlato(men.getPrecioPlato());
        men.setDescripcionPlato(men.getDescripcionPlato());
        men.setListaIngredientes(men.getListaIngredientes());

        this.createdMenu(men);

        return  men;
    }
}
