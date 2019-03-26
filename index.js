var reporter = require('cucumber-html-reporter');

var options = {
    theme: 'bootstrap',
    jsonFile: './target/Destination/cucumber.json',
    output: './target/Destination/cucumber_report.html',
    reportSuiteAsScenarios: true,
    launchReport: true,
    name: 'Créditos Empresas',
    brandTitle: 'Regresión',
    columnLayout: 1,
    metadata: {
        "Version":"1.0",
        "Test Environment": "Homologación",
        "Browser": "Chrome  54.0.2840.98",
        "Platform": "Windows 10",
        "Parallel": "Scenarios",
        "Executed": "Local"
    }
};

reporter.generate(options);