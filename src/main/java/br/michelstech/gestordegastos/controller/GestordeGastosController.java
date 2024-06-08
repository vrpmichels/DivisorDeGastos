package br.michelstech.gestordegastos.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestordeGastosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botaoeditar;

    @FXML
    private Button botaoexcluir;

    @FXML
    private Button botaosalvar;

    @FXML
    private TableColumn<?, ?> colCodigo;

    @FXML
    private TableColumn<?, ?> colDataDespesa;

    @FXML
    private TableColumn<?, ?> colDataLancamento;

    @FXML
    private TableColumn<?, ?> colDespesa;

    @FXML
    private TableColumn<?, ?> colValor;

    @FXML
    private DatePicker datadespesa;

    @FXML
    private DatePicker datalancamento;

    @FXML
    private TextField despesa;

    @FXML
    private ScrollPane scrollpanel;

    @FXML
    private TableView<?> tabela;

    @FXML
    private TextField valor;

    @FXML
    void initialize() {
        assert botaoeditar != null : "fx:id=\"botaoeditar\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert botaoexcluir != null : "fx:id=\"botaoexcluir\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert botaosalvar != null : "fx:id=\"botaosalvar\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert colCodigo != null : "fx:id=\"colCodigo\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert colDataDespesa != null : "fx:id=\"colDataDespesa\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert colDataLancamento != null : "fx:id=\"colDataLancamento\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert colDespesa != null : "fx:id=\"colDespesa\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert colValor != null : "fx:id=\"colValor\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert datadespesa != null : "fx:id=\"datadespesa\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert datalancamento != null : "fx:id=\"datalancamento\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert despesa != null : "fx:id=\"despesa\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert scrollpanel != null : "fx:id=\"scrollpanel\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert tabela != null : "fx:id=\"tabela\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";
        assert valor != null : "fx:id=\"valor\" was not injected: check your FXML file 'gestordegastos-view.fxml'.";

    }

}
