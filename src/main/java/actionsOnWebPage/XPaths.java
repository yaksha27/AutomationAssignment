package actionsOnWebPage;

public class XPaths {
	
	public class signInPage {
		public static final String signInButton = "//*[contains(text(),'Sign in')]";
		public static final String authenticationLbl = "//*[text()='Authentication']";
		public static final String emailIdTxt = "//*[@id='email_create']";
		public static final String createAnAccountBtn = "//*[@id='SubmitCreate']";
		public static final String invalidEmailAlert = "//*[@id='create_account_error']";
	}
	
	public class ApplicationFormPage{
		public static final String radioBtnMr = "//*[@id='uniform-id_gender1']";
		public static final String radioBtnMrs = "//*[@id='uniform-id_gender2']";
		public static final String firstNameTxt = "//*[@id='customer_firstname']";
		public static final String lastNameTxt = "//*[@id='customer_lastname']";
		public static final String emailTxt = "//*[@id = 'email']";
		public static final String passwordTxt = "//*[@id='passwd']";
		public static final String daysDropDown = "//*[@id='days']";
		public static final String monthsDropDown = "//*[@id='months']";
		public static final String yearsDropDown = "//*[@id='years']";
		public static final String newsletterChkBox = "//*[@id='uniform-newsletter']";
		public static final String splOfferChkBox = "//*[@id='uniform-optin']";
		public static final String firstNameAddressTxt = "//*[@id='firstname']";
		public static final String lastNameAddressTxt = "//*[@id='lastname']";
		public static final String addressLineTxt = "//*[@id='address1']";
		public static final String cityTxt = "//*[@id='city']";
		public static final String stateDropDown = "//*[@id='id_state']";
		public static final String zipCodeTxt = "//*[@id='postcode']";
		public static final String phoneNumTxt = "//*[@id='phone_mobile']";
		public static final String aliasAddressTxt = "//*[@id='alias']";
		public static final String registerBtn = "//*[@id='submitAccount']";
	}
	
	public class DressPage{
		public static final String dressesLink = "(//*[@id='block_top_menu']/ul/li)[2]";
		public static final String summerDressLink = "(//*[@id = 'categories_block_left']//ul/li)[3]";
		public static final String summerDressesLable = "//*[@id='center_column']//div//span[@class='category-name']";
		public static final String formSortBy = "//*[@id='productsSortForm']";
		public static final String selectSortBy = "//*[@id='selectProductSort']";
		public static final String productGridSummerDress = "//*[@class='product_list grid row']";
		public static final String priceList = "//*[@id='center_column']/ul/li/div/div[@class='right-block']/div/span[@itemprop='price']";
	}

}
