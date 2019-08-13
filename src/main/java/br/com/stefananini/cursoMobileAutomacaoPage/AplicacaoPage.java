package br.com.stefananini.cursoMobileAutomacaoPage;

import java.net.MalformedURLException;

import br.com.stefananini.cursoMobileAutomacaoCore.aplicacaoMobile;

public class AplicacaoPage extends  aplicacaoMobile{
	
	
	 // * Mapeamento dos elementos
	
	String btnSobre = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView";
	String txtMensagem = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";
	
	public void abrir() throws MalformedURLException, InterruptedException {
		
		getDriver();
	}
	
	public void clicarBotaoSobre() throws MalformedURLException, InterruptedException {
		
		getDriver().findElementByXPath(btnSobre).click();
		
	}
	
	public String validarTeste() throws MalformedURLException, InterruptedException {
		String mensagem = getDriver().findElementByXPath(txtMensagem).getText();
		System.out.println(getDriver().findElementByXPath(txtMensagem).getText());
		killDriver();
		return mensagem;
	}
}
