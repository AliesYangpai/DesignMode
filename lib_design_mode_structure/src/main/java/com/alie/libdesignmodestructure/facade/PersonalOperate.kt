package com.alie.libdesignmodestructure.facade

/**
 * 个人示意
 */
class PersonalOperate {
    private val mSubdistrictOffice = SubdistrictOffice()
    private val mCompanyOffice = CompanyOffice()
    private val mPoliceOffice = PoliceOffice()
    private var mNotaryOffice = NotaryOffice();

    fun doProvePersonInfo() {
        mSubdistrictOffice.fetchCertify()
        mCompanyOffice.fetchCertify()
        mPoliceOffice.policeVerify()
        mNotaryOffice.notarizeVerify();
        println("~~ 证明ok")
    }
}