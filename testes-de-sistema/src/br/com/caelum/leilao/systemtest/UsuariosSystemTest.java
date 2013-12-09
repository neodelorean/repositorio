package br.com.caelum.leilao.systemtest;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuariosSystemTest {

	private WebDriver driver;

	@Before
	public void inicializa() {
        System.setProperty("webdriver.chrome.driver","D:\\Ferramental\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
	}

	@Test
	public void deveAdicionarUmUsuario() {
		driver.get("http://localhost:8080/usuarios/new");

		WebElement nome = driver.findElement(By.name("usuario.nome"));
		WebElement email = driver.findElement(By.name("usuario.email"));

		nome.sendKeys("Ronaldo Luiz de Albuquerque");
		email.sendKeys("ronaldo2009@terra.com.br");

		nome.submit();

		assertTrue(driver.getPageSource().contains("Ronaldo Luiz de Albuquerque"));
		assertTrue(driver.getPageSource().contains("ronaldo2009@terra.com.br"));

	}

	@After
	public void encerra() {
		driver.close();
	}
}