# 附录 C：面向 PM 工作流的 CLAUDE.md 示例

复制并适配此模板用于你的项目。每部分的详细指导见第 3 章。

## 文件位置

- 推荐：项目根目录的 `CLAUDE.md`
- 个人偏好：`~/.claude/CLAUDE.md`（跨所有项目应用）

## CLAUDE.md 示例

```markdown
# Product Context for Claude Code

## About This Product
Acme Dashboard is a B2B analytics platform for e-commerce teams. Users
connect their store data, view sales metrics, and create custom reports.
Primary users are e-commerce managers and marketing analysts at
mid-market retailers.

## Product Terminology
- **Connector**: Integration with a data source (Shopify, WooCommerce, etc.)
- **Workspace**: A team's shared environment with its own connectors and reports
- **Metric**: A calculated value displayed on dashboards (sales, orders, AOV)
- **Segment**: A filtered subset of data used in reports (by date, product, channel)

## User Journeys
### New User Onboarding
1. User signs up → `src/auth/signup.js`
2. Connect first store → `src/services/connector-setup.js`
3. Data sync begins → `src/services/data-sync.js`
4. Dashboard shown with sample metrics → `src/components/dashboard/DashboardView.tsx`

### Report Creation
- Entry: `src/components/reports/ReportBuilder.tsx`
- Data retrieval: `src/services/report-engine.js`
- Export: `src/services/export-service.js`

## Business Rules
- Free tier: 1 workspace, 2 connectors, 30-day data retention
- Pro tier: 5 workspaces, unlimited connectors, 1-year retention
- Enterprise: Custom limits, SSO, dedicated support
- Connector sync failures retry 3x before alerting user
- Pricing: Never calculated in frontend — all pricing logic in `src/services/pricing/`

## Team Conventions
- All customer-facing strings use i18n in `src/locales/`
- Database migrations require data team approval
- Feature flags managed in `src/config/features.js`
- Jira IDs in commit messages: "Fix dashboard bug (AN-1234)"

## External Resources
- API docs: https://docs.internal.acme.com/api
- Design system: https://figma.com/design-system
- Product strategy: [Google Docs link]
- Analytics dashboard: https://analytics.internal.acme.com

## Common PM Questions
- "How does pricing work?" → See `src/services/pricing/`
- "Where is email content managed?" → `src/templates/email/`
- "What permissions do different roles have?" → `src/config/permissions.js`
```

## 逐部分指导

- **关于本产品（2-3 句话）**：它做什么？谁在使用它？在任何调查之前为 Claude Code 提供方向。
- **产品术语（5-10 个术语）**：定义在你的领域中具有特定含义或可能与常用术语混淆的词语。
- **用户旅程（3-5 个关键流程）**：将产品流程映射到代码位置。价值来自连接产品概念和实现。
- **业务规则（影响行为的约束）**：从代码中不明显的内容。定价层级、限制、特殊处理。
- **团队约定（如何工作）**：Claude Code 应遵循的实践以及避免建议的内容。
- **外部资源（链接）**：Claude Code 无法访问但你需要参考的文档、设计、分析。
- **常见 PM 问题（快速参考）**：经常被调查的主题及回答指针。

## 大小指导

以上示例大约 80 行，每会话消耗大约 2,000 token——对于显著的上下文改善来说成本极低。

## 快速开始

在任何项目中运行 `/init`，基于代码库分析生成初始 CLAUDE.md。编辑生成的文件以添加产品上下文、术语和用户旅程映射。从那里开始迭代。
