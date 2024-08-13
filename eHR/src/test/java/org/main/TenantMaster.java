package org.main;

import java.io.IOException;

import org.base.BaseClass;
import org.pages.AddTenantPage;
import org.pages.FeatureMasterActionPage;
import org.pages.FeatureMasterPage;
import org.pages.LanguageMasterPage;
import org.pages.LoginPage;
import org.pages.ModuleMasterActionPage;
import org.pages.ModuleMasterPage;
import org.pages.PlanModuleColumnWise;
import org.pages.PlanModulePageRowWise;
import org.pages.TenantAdminActionPage;
import org.pages.TenantMasterActionPage;
import org.testng.annotations.Test;

public class TenantMaster extends BaseClass {
	@Test(priority = 0)

	public void Login() throws Throwable {
		browserLaunch();
		enterAppInUrl("http://192.168.2.110:90/ehr_superadmin_testing/tenant-master");

		maximixeWindow();
		implicitWait(30);

		String UserName = addTenanteHR("LoginPage", 1, 0);
		String PassWord = addTenanteHR("LoginPage", 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.login(UserName, PassWord);

		String Organizationname = addTenanteHR("Tenant", 1, 0);
		String Addressone = addTenanteHR("Tenant", 1, 1);
		String Addresstwo = addTenanteHR("Tenant", 1, 2);
		String Pincode = addTenanteHR("Tenant", 1, 3);
		AddTenantPage tenant = new AddTenantPage(driver);
		tenant.addTenant(Organizationname, Addressone, Addresstwo, Pincode);

		String FirstNameAdmin = addTenanteHR("AddTenantAdmin", 1, 0);
		String LastNameAdmin = addTenanteHR("AddTenantAdmin", 1, 1);
		String AdminCustomerEmail = addTenanteHR("AddTenantAdmin", 1, 2);
		String AdminPhoneNumber = addTenanteHR("AddTenantAdmin", 1, 3);
		String AdminAlternatePhoneNumber = addTenanteHR("AddTenantAdmin", 1, 4);
		String AdminAddressOne = addTenanteHR("AddTenantAdmin", 1, 5);
		String AdminAddressTwo = addTenanteHR("AddTenantAdmin", 1, 6);
		String AdminPinCode = addTenanteHR("AddTenantAdmin", 1, 7);
		tenant.tenantAdmin(FirstNameAdmin, LastNameAdmin, AdminCustomerEmail, AdminPhoneNumber,
				AdminAlternatePhoneNumber, AdminAddressOne, AdminAddressTwo, AdminPinCode);

		String RoleNameAccess = addTenanteHR("RoleAccess", 1, 0);
		String RoleDescriptionAccess = addTenanteHR("RoleAccess", 1, 1);
		tenant.roleAccess(RoleNameAccess, RoleDescriptionAccess);

	}

	@Test(priority = 1)
	public void tenantMasterAction() throws Throwable {
		TenantMasterActionPage action = new TenantMasterActionPage(driver);
		Thread.sleep(2000);
		action.tenantViewAction();
		Thread.sleep(2000);
		String Addresstwo = addTenanteHR("Edit Action", 1, 0);
		String PinCode = addTenanteHR("Edit Action", 1, 1);
		action.tenantEditAction(Addresstwo, PinCode);
		Thread.sleep(3000);

		// action.tenantStatus();

		// action.extendPlanExpiry();

		// action.accessPermission();

		action.link();
		String RoleNameAccess = addTenanteHR("RoleAccess", 2, 0);
		String RoleDescriptionAccess = addTenanteHR("RoleAccess", 2, 1);

		action.roleAccess(RoleNameAccess, RoleDescriptionAccess);
	}

	@Test(priority = 2)
	public void tenantAdminAction() throws Throwable {
		TenantAdminActionPage actionAdmin = new TenantAdminActionPage(driver);
		actionAdmin.viewAdmin();
		actionAdmin.adminMail();
		String LastnameEditAdmin = addTenanteHR("AdminEdit", 1, 0);
		String AdminAlterphNum = addTenanteHR("AdminEdit", 1, 1);

		actionAdmin.adminEdit(LastnameEditAdmin, AdminAlterphNum);
		actionAdmin.deleteAdmin();
	}

	@Test(priority = 3)
	public void moduleMaster() throws Throwable {
		ModuleMasterPage masterPage = new ModuleMasterPage(driver);

		String ModuleName = addTenanteHR("ModuleMaster", 1, 0);
		String SubModuleMaster = addTenanteHR("ModuleMaster", 1, 1);
		String SubModuleNametwo = addTenanteHR("ModuleMaster", 1, 2);
		String SubmoduleThree = addTenanteHR("ModuleMaster", 1, 3);

		masterPage.moduleMaster(ModuleName, SubModuleMaster, SubModuleNametwo, SubmoduleThree);
	}

	@Test(priority = 5)
	public void moduleMasterAction() throws Throwable {

		ModuleMasterActionPage masterAction = new ModuleMasterActionPage(driver);

		masterAction.viewModuleMaster();
		masterAction.editMasterModule();
		masterAction.deleteMasterModule();

	}

	@Test(priority = 6)
	public void featureMaster() throws Throwable {
		FeatureMasterPage feature = new FeatureMasterPage(driver);
		String Featurename = addTenanteHR("FeatureMaster", 1, 0);
		feature.featureMasterModule(Featurename);
	}

	@Test(priority = 7)
	public void editAndDeleteFeatureMaster() throws Throwable {
		FeatureMasterActionPage masterAction = new FeatureMasterActionPage(driver);
		String NewFeature = addTenanteHR("FeatureMaster", 1, 1);
		masterAction.editFeature(NewFeature);
		masterAction.deleteFeature();

	}

	@Test(priority = 8)
	public void languageMaster() throws Throwable {
		LanguageMasterPage languageMaster = new LanguageMasterPage(driver);
		String Languagename = addTenanteHR("LanguageMaster", 1, 0);
		languageMaster.languageMaster(Languagename);
	}

	@Test(priority = 9)
	public void planModule() throws Throwable {
		PlanModuleColumnWise planModule = new PlanModuleColumnWise(driver);
		planModule.planModuleColumnWise();

	}

	@Test(priority = 10)
	public void planModuleRowwise() throws Throwable {
		PlanModulePageRowWise planModule = new PlanModulePageRowWise(driver);
		planModule.planModuleRowWise();
	}
}
